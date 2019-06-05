package com.example.agenda.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.agenda.R;
import com.example.agenda.model.Student;

public class formStudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_student);

        Button buttonSave = findViewById(R.id.button_student_save);
        final EditText inputName = findViewById(R.id.input_student_name);
        final EditText inputMail = findViewById(R.id.input_student_mail);
        final EditText inputPhone = findViewById(R.id.input_student_phone);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String studentName = inputName.getText().toString();
                String studentMail = inputMail.getText().toString();
                String studentPhone = inputPhone.getText().toString();

                Student createdStudent = new Student(studentName, studentMail, studentPhone);

                Toast.makeText(formStudentActivity.this, createdStudent.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
