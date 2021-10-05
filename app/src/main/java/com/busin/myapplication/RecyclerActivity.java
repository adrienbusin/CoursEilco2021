package com.busin.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.busin.myapplication.adpater.PokemonAdapter;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(getApplicationContext(), 2);

        recyclerView.setLayoutManager(linearLayoutManager);

        List<Pokemon> pokemonList = new ArrayList<>();
        pokemonList.add(new Pokemon("1", "TOTO"));
        pokemonList.add(new Pokemon("2", "TUTU"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));
        pokemonList.add(new Pokemon("3", "TITI"));

        PokemonAdapter pokemonAdapter = new PokemonAdapter(pokemonList);

        recyclerView.setAdapter(pokemonAdapter);
    }
}