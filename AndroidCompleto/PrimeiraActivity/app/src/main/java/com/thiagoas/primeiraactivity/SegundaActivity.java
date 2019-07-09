package com.thiagoas.primeiraactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textNome;
    private TextView textNumero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textNome = findViewById(R.id.tvNome);
        textNumero = findViewById(R.id.tvNumero);

        // recuperando dados

        Bundle dados = getIntent().getExtras();
        Usuario usuario = (Usuario) dados.getSerializable("obj");

        String nome = dados.getString("tvNome");
        int idade = dados.getInt("tvNumero");

        textNome.setText(usuario.getNome());
        textNumero.setText(String.valueOf(idade));


    }
}
