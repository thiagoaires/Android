package com.example.agenda.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.agenda.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listStudentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists_students);
        setTitle("Lista de Alunos");

        List<String> listStudents = new ArrayList<>(Arrays.asList("Thiago", "Aires", "Silva", "Kevin", "Bacon"));
        ListView listStudentsView = findViewById(R.id.activity_list_students_listview);

        listStudentsView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listStudents));
    }
}
