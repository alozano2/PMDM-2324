package com.ejemplo.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.ejemplo.pmdm_2324.R;

public class u3a7bMetalSlugArma extends AppCompatActivity {
    public static final String CADENA_ELECCION_ARMA = "ELECCIONJUGADOR";
    ImageView imgArma1, imgArma2, imgArma3, imgArma4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a7b_metal_slug_arma);

        imgArma1 = findViewById(R.id.u3a7bimgVArma1);
        imgArma2 = findViewById(R.id.u3a7bimgVArma2);
        imgArma3 = findViewById(R.id.u3a7bimgVArma3);
        imgArma4 = findViewById(R.id.u3a7bimgVArma4);

        imgArma1.setOnClickListener(view -> {
            Intent data = new Intent();
            data.putExtra(CADENA_ELECCION_ARMA, R.drawable.arma1);
            setResult(Activity.RESULT_OK, data);
            finish();
        });


        imgArma2.setOnClickListener(view -> {
            Intent data = new Intent();
            data.putExtra(CADENA_ELECCION_ARMA, R.drawable.arma2);
            setResult(Activity.RESULT_OK, data);
            finish();
        });

        imgArma3.setOnClickListener(view -> {
            Intent data = new Intent();
            data.putExtra(CADENA_ELECCION_ARMA, R.drawable.arma3);
            setResult(Activity.RESULT_OK, data);
            finish();
        });

        imgArma4.setOnClickListener(view -> {
            Intent data = new Intent();
            data.putExtra(CADENA_ELECCION_ARMA, R.drawable.arma4);
            setResult(Activity.RESULT_OK, data);
            finish();
        });

    }
}