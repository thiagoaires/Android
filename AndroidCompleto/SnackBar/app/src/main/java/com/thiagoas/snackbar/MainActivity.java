package com.thiagoas.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button btAbrir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btAbrir = findViewById(R.id.btAbrir);

        btAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "bt pressionado", Snackbar.LENGTH_LONG)
                        .setAction("Confirmar", new View.OnClickListener(){
                            @Override
                            public void onClick(View view) {
                                btAbrir.setText("Botao Alterado");
                            }
                        })
                        .setActionTextColor(getResources().getColor(R.color.colorPrimary))
                        .show();
            }
        });
    }
}
