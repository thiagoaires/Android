package com.thiagoas.calculadoradegorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editValor;
    private TextView textGorjeta;
    private TextView textTotal;
    private TextView textPorcentagem;
    private SeekBar seekBarPorcentagem;

    private double porcentagem = 0;
    private double valorGorjeta;
    private double valorTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValor = findViewById(R.id.etValor);
        textGorjeta = findViewById(R.id.tvGorjeta);
        textPorcentagem = findViewById(R.id.tvPorcentagem);
        textTotal = findViewById(R.id.tvTotal);
        seekBarPorcentagem = findViewById(R.id.sbPorcentagem);

        seekBarPorcentagem.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                porcentagem = seekBar.getProgress();
                textPorcentagem.setText(Math.round(porcentagem) + " %");

                calcular();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void calcular(){
        double valorDigitado = Double.parseDouble(editValor.getText().toString());
        double gorjeta = valorDigitado * (porcentagem/100);
        double total = gorjeta + valorDigitado;

        textGorjeta.setText("R$" + Math.round(gorjeta));
        textTotal.setText("R$" + total);

    }
}
