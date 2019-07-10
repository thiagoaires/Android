package com.thiagoas.fragment.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.thiagoas.fragment.R;
import com.thiagoas.fragment.fragment.ContatosFragment;
import com.thiagoas.fragment.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonContato, buttonConversa;
    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setElevation(0);


        buttonContato = findViewById(R.id.buttonContato);
        buttonConversa = findViewById(R.id.buttonConversa);

        conversasFragment = new ConversasFragment();

        //config obj pro fragmento

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, conversasFragment);
        transaction.commit();

        buttonContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contatosFragment = new ContatosFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, contatosFragment);
                transaction.commit();
            }
        });

        buttonConversa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, conversasFragment);
                transaction.commit();

            }
        });
    }
}
