package com.thiagoas.caraecoroa.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.thiagoas.caraecoroa.R;

public class ResultActivity extends AppCompatActivity {

    private ImageButton ibVoltar;
    private ImageView imageViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ibVoltar = findViewById(R.id.ibVoltar);
        imageViewResultado = findViewById(R.id.ivResultado);
        Bundle bundle = getIntent().getExtras();
        int numeroSorteado = bundle.getInt("valor");

        if(numeroSorteado == 0){
            imageViewResultado.setImageResource(R.drawable.moeda_cara);
        } else {
            imageViewResultado.setImageResource(R.drawable.moeda_coroa);
        }

        ibVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
