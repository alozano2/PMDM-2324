package com.ejemplo.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

import org.w3c.dom.Text;

public class u3a7bMetalSlugPersonaje extends AppCompatActivity {
    public static final String CADENA_ELECCION = "ELECCIONJUGADOR";
    ImageView imgEri, imgTarma, imgMarco, imgArmando;
    int personajeEnUso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a7b_metal_slug_personaje);

        imgEri = findViewById(R.id.u3a7bimgVPersonaje2);
        imgTarma = findViewById(R.id.u3a7bimgVPersonaje1);
        imgMarco = findViewById(R.id.u3a7bimgVPersonaje3);
        imgArmando = findViewById(R.id.u3a7bimgVPersonaje4);
        Bundle info = getIntent().getExtras();
        personajeEnUso = info.getInt(u3a7aMetalSlug.CLAVE_PERSONAJE_USADO);

        imgTarma.setOnClickListener(view -> {
            Intent data = new Intent();
            data.putExtra(CADENA_ELECCION, R.drawable.metaslug1);
            setResult(Activity.RESULT_OK, data);
            finish();
        });

        imgEri.setOnClickListener(view -> {
            Intent data = new Intent();
            data.putExtra(CADENA_ELECCION, R.drawable.metalslug2);
            setResult(Activity.RESULT_OK, data);
            finish();
        });

        imgMarco.setOnClickListener(view -> {
            Intent data = new Intent();
            data.putExtra(CADENA_ELECCION, R.drawable.metalslug3);
            setResult(Activity.RESULT_OK, data);
            finish();
        });

        imgArmando.setOnClickListener(view -> {
            Intent data = new Intent();
            data.putExtra(CADENA_ELECCION, R.drawable.metalslug4);
            setResult(Activity.RESULT_OK, data);
            finish();
        });

        if(personajeEnUso == R.drawable.metalslug2){
            imgEri.setColorFilter(Color.argb(150, 0, 0, 0));
            imgEri.setClickable(false);
        }

        if(personajeEnUso == R.drawable.metaslug1){
            imgTarma.setColorFilter(Color.argb(150, 0, 0, 0));
            imgTarma.setClickable(false);
        }

        if(personajeEnUso == R.drawable.metalslug3){
            imgMarco.setColorFilter(Color.argb(150, 0, 0, 0));
            imgMarco.setClickable(false);
        }

        if(personajeEnUso == R.drawable.metalslug4){
            imgArmando.setColorFilter(Color.argb(150, 0, 0, 0));
            imgArmando.setClickable(false);
        }
    }
}