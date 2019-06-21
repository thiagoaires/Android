package com.example.agenda.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.agenda.R;
import com.example.agenda.dao.StudentDAO;
import com.example.agenda.model.Student;

public class formStudentActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Novo aluno";
    private EditText inputName;
    private EditText inputMail;
    private EditText inputPhone;
    private Student student;
    final StudentDAO dao = new StudentDAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_student);

        setTitle(TITLE_APPBAR);

        createFormStudent();

        configureButtonSaveStudent();

        Intent listData = getIntent();

        student = (Student) listData.getSerializableExtra("student");

        Log.i("gettt", "onCreate: " + student.getName()+ student.getPhone() +  student.getMail());

        inputName.setText(student.getName());
        inputMail.setText(student.getMail());
        inputPhone.setText(student.getPhone());

    }

    private void configureButtonSaveStudent() {
        Button buttonSave = findViewById(R.id.button_student_save);

        buttonSave.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                fillStudent();
                dao.save(student);
                finish();
            }
        });
    }

    private void createFormStudent() {
        inputName = findViewById(R.id.input_student_name);
        inputMail = findViewById(R.id.input_student_mail);
        inputPhone = findViewById(R.id.input_student_phone);
    }

    private void saveStudent(Student createdStudent) {
        dao.save(createdStudent);

        finish();
    }

    private void fillStudent() {
        String studentName = inputName.getText().toString();
        String studentMail = inputMail.getText().toString();
        String studentPhone = inputPhone.getText().toString();

        student.setName(studentName);
        student.setMail(studentMail);
        student.setPhone(studentPhone);
    }
}


