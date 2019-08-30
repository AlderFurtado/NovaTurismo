package com.novaturistmo.novaturismo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.novaturistmo.novaturismo.Adapter.CategoriaAdapter;
import com.novaturistmo.novaturismo.Adapter.PontoAdapter;
import com.novaturistmo.novaturismo.Models.CategoriaItem;
import com.novaturistmo.novaturismo.Models.Ponto;

import java.util.ArrayList;
import java.util.List;

public class ListaPontosActivity extends AppCompatActivity {

    private RecyclerView recycle_view_categorias;
    private CategoriaAdapter categoriaAdapter;
    private List<CategoriaItem> categoriaItems;


    private RecyclerView recycle_view_pontos;
    private PontoAdapter pontoAdapter;
    private List<Ponto> pontos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pontos);

        //Setup da lista de categorias


        categoriaItems = new ArrayList<>();

        categoriaItems.add(new CategoriaItem("Pontos Turísticos",R.drawable.ic_banharn_tower));
        categoriaItems.add(new CategoriaItem("Igrejas",R.drawable.ic_church));
        categoriaItems.add(new CategoriaItem("Culinária",R.drawable.ic_soup));
        categoriaItems.add(new CategoriaItem("ilhas",R.drawable.ic_island));
        categoriaItems.add(new CategoriaItem("Delegacias",R.drawable.ic_policeman));
        categoriaItems.add(new CategoriaItem("Hospitais",R.drawable.ic_hospital));

        recycle_view_categorias = findViewById(R.id.recycle_view_categorias);

        categoriaAdapter = new CategoriaAdapter(this,categoriaItems);
        //Setando um layout horizontal
        recycle_view_categorias.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        recycle_view_categorias.setAdapter(categoriaAdapter);



        //Setup da lista de pontos

        pontos = new ArrayList<>();

        pontos.add(new Ponto("Ilha do Combu",R.drawable.combu));
        pontos.add(new Ponto("Cotijuba",R.drawable.cotijuba));
        pontos.add(new Ponto("Cotijuba",R.drawable.cotijuba));
        pontos.add(new Ponto("Cotijuba",R.drawable.cotijuba));
        pontos.add(new Ponto("Cotijuba",R.drawable.cotijuba));
        pontos.add(new Ponto("Cotijuba",R.drawable.cotijuba));
        pontos.add(new Ponto("Cotijuba",R.drawable.cotijuba));
        pontos.add(new Ponto("Cotijuba",R.drawable.cotijuba));


        recycle_view_pontos = findViewById(R.id.recycle_view_ponto);

        pontoAdapter = new PontoAdapter(this,pontos);

        recycle_view_pontos.setLayoutManager(new LinearLayoutManager(this));

        recycle_view_pontos.setAdapter(pontoAdapter);


    }

}
