package com.busin.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PokemonViewHolder extends RecyclerView.ViewHolder {

    TextView id;
    TextView name;

    public PokemonViewHolder(@NonNull View itemView) {
        super(itemView);
        id = itemView.findViewById(R.id.id);
        name = itemView.findViewById(R.id.name);
    }

    public void bind(Pokemon pokemon) {
        id.setText(pokemon.id);
        name.setText(pokemon.name);
    }
}
