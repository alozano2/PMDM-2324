package com.ejemplo.pmdm_2324.ut03;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

public class u3a1aLanza extends AppCompatActivity {
    public static final String INFO_NOMBRE = "CLAVE_NOMBRE";
    Button btObtenerNumero;
    TextView tvNumero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a1a_lanza);

        //Codigo para hacer ejercicio 4
        btObtenerNumero = findViewById(R.id.u3a1btnLanza);
        tvNumero = findViewById(R.id.u3a1tvNumero);

        ActivityResultLauncher<Intent> lanzador = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if(result.getResultCode() == Activity.RESULT_OK){
                        Intent data = result.getData();
                        tvNumero.setText(data.getStringExtra(u3a1bLanzada.CLAVE_NUMERO));
                    }
                }
        );

        btObtenerNumero.setOnClickListener(view -> {
            Intent i = new Intent(this,u3a1bLanzada.class);
            lanzador.launch(i);
        });
    }
}