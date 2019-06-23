package com.thiagoas.frases;

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

    public void generateNewPhrase(View view){
        String[] phrases = {
                "Tarde",
                "Noite",
                "Uai so",
                "gimme fuel",
                "oloco bisho"
        };

        int numberPhrases = new Random().nextInt(phrases.length);
        TextView textPhrase = findViewById(R.id.tvPhraseGenerated);

        textPhrase.setText(phrases[numberPhrases]);
    }
}
