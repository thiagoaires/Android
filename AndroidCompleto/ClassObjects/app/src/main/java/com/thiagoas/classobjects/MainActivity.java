package com.thiagoas.classobjects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.thiagoas.classobjects.classes.Conta;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Conta contaThiago = new Conta();


        contaThiago.depositar(200);

        contaThiago.saque(120);





/*
//        Casa minhaCasa = new Casa();
//
//        minhaCasa.cor = "azul";
//
//        Animal animal = new Animal();
//        animal.correr();

        Cao cao = new Cao();
//        cao.dormir();
//        cao.latir();

        cao.setCor("azul");

        System.out.println(cao.getCor());

        cao.correr();



*/
    }
}
