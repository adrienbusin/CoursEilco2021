package com.busin.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    int i = 5;

    ActivityResultLauncher<Intent> activityResultLauncher =
            registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
                if(result.getResultCode() == Activity.RESULT_OK){
                    if (result.getData() != null) {
                        result.getData().getSerializableExtra("VOITURE");
                    }
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.hello_world);

        Voiture voiture = new Voiture();
        voiture.brand = "Opel";
        voiture.color = "RED";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
//                intent.putExtra("TEST", "COME FORM ACTIVITY 1");
//                intent.putExtra("VOITURE", voiture);
//                activityResultLauncher.launch(intent);

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://toto.com"));
                startActivity(intent);

            }
        });

        i = 6;
        Log.d("OnCreate function", "called");


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://pokeapi.glitch.me/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PokemonService service = retrofit.create(PokemonService.class);

        service.getPokemonById("14").enqueue(new Callback<List<Pokemon>>() {
            @Override
            public void onResponse(Call<List<Pokemon>> call, Response<List<Pokemon>> response) {
                List<Pokemon> pokemons = response.body();
                if (pokemons != null) {
                    String pokemonName = pokemons.get(0).name;
                    TextView textView = findViewById(R.id.textView2);
                    textView.setText(pokemonName);
                }
            }

            @Override
            public void onFailure(Call<List<Pokemon>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("OnResume function", "called");
    }

}