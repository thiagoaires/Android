package com.thiagoas.classobjects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    }
}
