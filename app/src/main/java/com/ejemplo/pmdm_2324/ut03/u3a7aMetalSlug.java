package com.ejemplo.pmdm_2324.ut03;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.ejemplo.pmdm_2324.R;

public class u3a7aMetalSlug extends AppCompatActivity {

    public static final String CLAVE_IMAGEN = "CLAVEIMG";
    ImageView usuJ1, usuJ2, armaJ1, armaJ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a7a_metal_slug);

        usuJ1 = findViewById(R.id.u3a7aimgVJ1);
        usuJ2 = findViewById(R.id.u3a7aimgVJ2);
        armaJ1 = findViewById(R.id.u3a7aimgVArmJ1);
        armaJ2 = findViewById(R.id.u3a7aimgVArmJ2);

        ActivityResultLauncher<Intent> lanzador = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if(result.getResultCode() == Activity.RESULT_OK){
                        Intent data = result.getData();
                        usuJ1.setImageResource(data.getExtras().getInt(u3a7bMetalSlugPersonaje.CADENA_ELECCION));
                    }
                }
        );

        ActivityResultLauncher<Intent> lanzador2 = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if(result.getResultCode() == Activity.RESULT_OK){
                        Intent data = result.getData();
                        usuJ2.setImageResource(data.getExtras().getInt(u3a7bMetalSlugPersonaje.CADENA_ELECCION));
                    }
                }
        );

        ActivityResultLauncher<Intent> lanzadorArmas1 = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if(result.getResultCode() == Activity.RESULT_OK){
                        Intent data = result.getData();
                        armaJ1.setImageResource(data.getExtras().getInt(u3a7bMetalSlugArma.CADENA_ELECCION_ARMA));
                    }
                }
        );

        ActivityResultLauncher<Intent> lanzadorArmas2 = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if(result.getResultCode() == Activity.RESULT_OK){
                        Intent data = result.getData();
                        armaJ2.setImageResource(data.getExtras().getInt(u3a7bMetalSlugArma.CADENA_ELECCION_ARMA));
                    }
                }
        );

        usuJ1.setOnClickListener(view -> {
            Intent i = new Intent(this, u3a7bMetalSlugPersonaje.class);
            lanzador.launch(i);
        });

        usuJ2.setOnClickListener(view -> {
            Intent i = new Intent(this, u3a7bMetalSlugPersonaje.class);
            lanzador2.launch(i);
        });

        armaJ1.setOnClickListener(view -> {
            Intent i = new Intent(this, u3a7bMetalSlugArma.class);
            lanzadorArmas1.launch(i);
        });

        armaJ2.setOnClickListener(view -> {
            Intent i = new Intent(this, u3a7bMetalSlugArma.class);
            lanzadorArmas2.launch(i);
        });
    }
}