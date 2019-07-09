package com.thiagoas.primeiraactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;
    Usuario user = new Usuario("Maka o`pagno", "makarrao#gmail.com");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.btPrimeiraActivity);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);
                intent.putExtra("tvNome", "Thiago");
                intent.putExtra("tvNumero", 12);
                intent.putExtra("obj", user);
                startActivity(intent);
            }
        });
    }

}
