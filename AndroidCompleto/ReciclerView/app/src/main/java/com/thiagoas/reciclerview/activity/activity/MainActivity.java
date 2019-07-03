package com.thiagoas.reciclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.thiagoas.reciclerview.R;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewPadrao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        recyclerViewPadrao = findViewById(R.id.recyclerViewPadrao);
        setContentView(R.layout.activity_main);

        //adapter

        //recyclerView

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewPadrao.setLayoutManager(layoutManager);
        recyclerViewPadrao.setHasFixedSize(true);


    }
}
