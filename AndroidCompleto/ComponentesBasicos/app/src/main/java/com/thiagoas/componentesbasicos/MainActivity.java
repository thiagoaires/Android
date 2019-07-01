package com.thiagoas.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText campoProduto;
    private TextView textoResultado;
    private CheckBox cbAmarelo, cbVerde, cbAzul;
    List<String> checkValue = new ArrayList<String>();
    private RadioGroup rgEstoque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoProduto = findViewById(R.id.etNomeProduto);
        textoResultado = findViewById(R.id.tvResultado);

        cbAmarelo = findViewById(R.id.cbAmarelo);
        cbVerde = findViewById(R.id.cbVerde);
        cbAzul  = findViewById(R.id.cbAzul);

        rgEstoque = findViewById(R.id.rgEstoque);

        verificaRadioButton();


    }

    public void verificaCheck(){
        checkValue.clear();

        if (cbAmarelo.isChecked()){
            checkValue.add(cbAmarelo.getText().toString());
        }

        if(cbVerde.isChecked()){
            checkValue.add(cbVerde.getText().toString());
        }
        if(cbAzul.isChecked()){
            checkValue.add(cbAzul.getText().toString());
        }

    }
    public void verificaRadioButton(){
        rgEstoque.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rbSim){
                    textoResultado.setText("sim");
                } else{
                    textoResultado.setText("nao");
                }
            }
        });
    }
    public void enviarFormulario(View view){
//        String nomeProduto = campoProduto.getText().toString();
//        textoResultado.setText(nomeProduto);
        //verificaCheck();
        verificaRadioButton();
        textoResultado.setText(checkValue.toString());
    }
}
