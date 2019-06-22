package com.thiagoas.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){
        TextView textoResultado = findViewById(R.id.textoResultado);
        int numero = new Random().nextInt(10);

        textoResultado.setText("numero selecionado é? " + numero);
    }
}
