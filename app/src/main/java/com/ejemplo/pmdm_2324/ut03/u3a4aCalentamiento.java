package com.ejemplo.pmdm_2324.ut03;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

public class u3a4aCalentamiento extends AppCompatActivity {
    public static final String CAMBIO_NOMBRE = "El nombre del usuario ha sido modificado.";
    public static final String ACCION_CANCELADA = "El usuario ha cancelado la acción.";
    TextView tvNombre, tvAccion;
    Button btnAceptar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a4a_calentamiento);

        tvNombre = findViewById(R.id.u3a4atvNombre);
        tvAccion = findViewById(R.id.u3a4atvAccion);
        btnAceptar = findViewById(R.id.u3a4abtnIngNombre);

        ActivityResultLauncher <Intent> lanzador = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if(result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        tvNombre.setText(data.getStringExtra(u3a4bCalentamiento.CLAVE_NOMBRE));
                        tvAccion.setText(CAMBIO_NOMBRE);
                        tvAccion.setTextColor(getResources().getColor(R.color.green));
                    }

                    if(result.getResultCode() == Activity.RESULT_CANCELED){
                        Intent data = result.getData();
                        tvAccion.setText(ACCION_CANCELADA);
                        tvAccion.setTextColor(getResources().getColor(R.color.red));
                    }
                }
        );

        btnAceptar.setOnClickListener(view -> {
            Intent i = new Intent(this, u3a4bCalentamiento.class);
            lanzador.launch(i);
        });
    }
}