package com.thiagoas.caraecoroa.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.thiagoas.caraecoroa.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageButton buttonJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonJogar = findViewById(R.id.btJogar);

        buttonJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);

                int numero = new Random().nextInt(2);
                intent.putExtra("valor", numero);
                startActivity(intent);
            }
        });
    }
}
