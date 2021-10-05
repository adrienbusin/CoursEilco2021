package com.busin.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extra = getIntent().getExtras();

        Voiture voitureFromActivity1 = (Voiture) extra.getSerializable("VOITURE");

        Toast.makeText(this, voitureFromActivity1.brand, Toast.LENGTH_SHORT).show();

        voitureFromActivity1.color = "BLACK";

        Button button = findViewById(R.id.button_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                setResult(Activity.RESULT_CANCELED);
//                onBackPressed();

                Intent resultIntent = new Intent();
                resultIntent.putExtra("VOITURE", voitureFromActivity1);
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}