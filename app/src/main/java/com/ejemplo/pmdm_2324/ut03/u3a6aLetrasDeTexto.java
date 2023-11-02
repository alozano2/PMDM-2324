package com.ejemplo.pmdm_2324.ut03;

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
import android.widget.EditText;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

public class u3a6aLetrasDeTexto extends AppCompatActivity {
    EditText etEscribeTexto;
    TextView tvInfo;
    Button btnAnalizar;
    public static final String CLAVE_FRASE = "FRASE";
    public static final String CLAVE_ERROR = "Debes ingresar una frase";
    public static final String CLAVE_PRINT = "Las letras mas repetidas son:\n ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a5a_letras_de_texto);

        etEscribeTexto = findViewById(R.id.u3a6aetTextoLargo);
        tvInfo = findViewById(R.id.u3a6atvInfo);
        btnAnalizar = findViewById(R.id.u3a6abtnAnalizar);

        ActivityResultLauncher <Intent> lanzador = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if(result.getResultCode() == Activity.RESULT_OK){
                        Intent data = result.getData();
                        tvInfo.setText(CLAVE_PRINT + "1. " + data.getStringExtra(u3a6bLetrasDeTexto.CLAVE_PRIMERA) + "\n 2. " +
                                data.getStringExtra(u3a6bLetrasDeTexto.CLAVE_SEGUNDA) + "\n 3. " +
                                data.getStringExtra(u3a6bLetrasDeTexto.CLAVE_TERCERA));
                    }

                    if(result.getResultCode() == Activity.RESULT_CANCELED){
                        tvInfo.setText(CLAVE_ERROR);
                    }
                }
        );

        btnAnalizar.setOnClickListener(view -> {
            if(etEscribeTexto.getText().toString().isEmpty()){
                tvInfo.setText(CLAVE_ERROR);
            }else {
                Intent i = new Intent(this, u3a6bLetrasDeTexto.class);
                i.putExtra(CLAVE_FRASE, etEscribeTexto.getText().toString());
                lanzador.launch(i);
            }
        });
    }
}