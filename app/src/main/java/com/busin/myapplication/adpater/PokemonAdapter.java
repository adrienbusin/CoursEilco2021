package com.busin.myapplication.adpater;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.busin.myapplication.Pokemon;
import com.busin.myapplication.PokemonViewHolder;
import com.busin.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonViewHolder> {

    List<Pokemon> pokemons;

    public PokemonAdapter(List<Pokemon> pokemonList) {
        pokemons = pokemonList;
    }

    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pokemon, parent, false);
        return new PokemonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {
        Pokemon pokemon = pokemons.get(position);
        holder.bind(pokemon);
    }

    @Override
    public int getItemCount() {
        return pokemons.size();
    }
}
