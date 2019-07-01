package com.thiagoas.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editPrecoAlcool = findViewById(R.id.etAlcool);
        editPrecoGasolina = findViewById(R.id.etGasolina);
        textoResultado = findViewById(R.id.tvResultado);


    }


    public void calcularPreco(View view){
        String precoAlcool = editPrecoAlcool.getText().toString();
        String precoGasolina = editPrecoGasolina.getText().toString();

        Boolean precosValidados = this.validaCampo(precoAlcool, precoGasolina);

        if(precosValidados){
            this.calculaMelhorPreco(precoAlcool, precoGasolina);
        } else {
            textoResultado.setText("insira os precos corretamente");
        }

    }
    public void calculaMelhorPreco(String pAlcool, String pGasolina){
        Double precoAlcool = Double.parseDouble(pAlcool);
        Double precoGasolina = Double.parseDouble(pGasolina);
        Double resultado = precoAlcool / precoGasolina;
        if (resultado >= 0.7){
            textoResultado.setText("melhor gasolina");
        } else{
            textoResultado.setText("melhor Alcool");
        }
    }

    public boolean validaCampo(String pAlcool, String pGasolina){
        Boolean camposValidados = true;

        if (pAlcool == null || pAlcool.equals("")){
            camposValidados = false;
        } else if (pGasolina == null || pGasolina.equals("")){
            camposValidados = false;
        }

        return camposValidados;
    }
}
