package com.thiagoas.jankenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void selecionarPedra(View view){
        this.opcaoSelecionada("pedra");
    }
    public void selectionarPapel(View view){
        this.opcaoSelecionada("papel");
    }
    public void selecionarTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }
    public void opcaoSelecionada(String escolhaUsuario){
        TextView tvTextResult = (TextView) findViewById(R.id.textResult);
        int joken = new Random().nextInt(3);
        ImageView ivImgResultado = (ImageView) findViewById(R.id.imageResultado);

        String[] opcoes = {"pedra", "papel", "tesoura"};
        String escolhaApp = opcoes[joken];

        switch (escolhaApp){
            case "pedra":
                ivImgResultado.setImageResource(R.drawable.ic_stone);
                break;
            case "papel":
                ivImgResultado.setImageResource(R.drawable.ic_paper);
                break;
            case "tesoura":
                ivImgResultado.setImageResource(R.drawable.ic_scissor);
                break;
            default:
                break;
        }

        if(
            escolhaApp == "tesoura" && escolhaUsuario == "papel" ||
            escolhaApp == "papel" && escolhaUsuario == "pedra" ||
            escolhaApp == "pedra" && escolhaUsuario == "tesoura"
        ){
            tvTextResult.setText("App Ganhou");
        } else if (
            escolhaUsuario == "tesoura" && escolhaApp == "papel" ||
            escolhaUsuario == "papel" && escolhaApp == "pedra" ||
            escolhaUsuario == "pedra" && escolhaApp == "tesoura"
        ){
            tvTextResult.setText("voce ganhou");
        } else{
            tvTextResult.setText("Double KO");
        }

        System.out.println(escolhaUsuario + " " + escolhaApp);

    }
}
