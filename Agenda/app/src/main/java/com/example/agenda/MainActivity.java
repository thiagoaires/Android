package com.example.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> listStudents = new ArrayList<>(Arrays.asList("Thiago", "Aires", "Silva"));

        TextView primeiroAluno = findViewById(R.id.textView);
        primeiroAluno.setText(listStudents.get(1));
    }
}
