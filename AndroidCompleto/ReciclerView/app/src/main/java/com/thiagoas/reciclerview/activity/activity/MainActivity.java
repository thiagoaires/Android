package com.thiagoas.reciclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.thiagoas.reciclerview.R;
import com.thiagoas.reciclerview.activity.adapter.Adapter;
import com.thiagoas.reciclerview.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewPadrao;
    private List<Filme> listaFilmes = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        recyclerViewPadrao = findViewById(R.id.recyclerViewPadrao);


        //listagem de filmes
        this.criarFilmes();

        //adapter
        Adapter adapter = new Adapter(listaFilmes);

        //recyclerView

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewPadrao.setLayoutManager(layoutManager);
        recyclerViewPadrao.setHasFixedSize(true);
        recyclerViewPadrao.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerViewPadrao.setAdapter(adapter);


        //evento de click


    }

    public void criarFilmes(){
        Filme filme = new Filme("Vento ventou", "fantasia", "1945");
        this.listaFilmes.add(filme);
        filme = new Filme("Blue lake", "loop infinito do cinema em casa", "1945");
        this.listaFilmes.add(filme);
        filme = new Filme("Star woks", "ficcao", "1945");
        this.listaFilmes.add(filme);
        filme = new Filme("Star treco", "ficcao", "1945");
        this.listaFilmes.add(filme);
        filme = new Filme("Vento ventou", "fantasia", "1945");
        this.listaFilmes.add(filme);
        filme = new Filme("Blue lake", "loop infinito do cinema em casa", "1945");
        this.listaFilmes.add(filme);
        filme = new Filme("Star woks", "ficcao", "1945");
        this.listaFilmes.add(filme);
        filme = new Filme("Star treco", "ficcao", "1945");
        this.listaFilmes.add(filme);
        filme = new Filme("Blue lake", "loop infinito do cinema em casa", "1945");
        this.listaFilmes.add(filme);
        filme = new Filme("Star woks", "ficcao", "1945");
        this.listaFilmes.add(filme);
        filme = new Filme("Star treco", "ficcao", "1945");
        this.listaFilmes.add(filme);
        filme = new Filme("Vento ventou", "fantasia", "1945");
        this.listaFilmes.add(filme);
        filme = new Filme("Blue lake", "loop infinito do cinema em casa", "1945");
        this.listaFilmes.add(filme);
        filme = new Filme("Star woks", "ficcao", "1945");
        this.listaFilmes.add(filme);
        filme = new Filme("Star treco", "ficcao", "1945");
        this.listaFilmes.add(filme);
    }
}
