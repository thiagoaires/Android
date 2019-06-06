package com.example.agenda.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.agenda.R;
import com.example.agenda.dao.StudentDAO;

public class listStudentActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Lista de Alunos";
    private final StudentDAO dao = new StudentDAO();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists_students);

        setTitle(TITLE_APPBAR);

    }

    @Override
    protected void onResume() {
        super.onResume();

        configureStudentList();
    }


    private void configureStudentList() {
        ListView listStudentsView = findViewById(R.id.activity_list_students_listview);

        listStudentsView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dao.getAll()));

        configureFABNewStudent();
    }

    private void configureFABNewStudent() {
        FloatingActionButton newStudentButton = findViewById(R.id.activity_main_fab_new_student);

        newStudentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFormStudentActivity();
            }
        });
    }

    private void openFormStudentActivity() {
        startActivity( new Intent(this, formStudentActivity.class));
    }
}
