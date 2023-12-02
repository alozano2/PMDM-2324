package com.ejemplo.pmdm_2324.ut04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.ejemplo.pmdm_2324.R;
import com.ejemplo.pmdm_2324.ut03.Monstruo;
import com.ejemplo.pmdm_2324.ut03.u3a8aFabricarMonstruo;

public class u4a2aMonstruo extends AppCompatActivity {
    private static final String ERROR_MANOS = "Error al ingresar el numero de manos";
    private static final String ERROR_PIERNAS = "Error al ingresar el numero de piernas.";
    private static final String ERROR_COLOR = "Error al ingresar el color";
    EditText etNombre, etManos, etPiernas, etColor;
    Button btnContruir;
    u4a2fMonstruo fragment, fragment1, fragment2, fragment3, fragment4;
    Spinner spnEleccion;
    public static final String ERROR_NOMBRE = "Error al ingresar el nombre";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u4a2a_monstruo);

        etNombre = findViewById(R.id.u4a2aetNombre);
        etManos = findViewById(R.id.u4a2aetBrazos);
        etPiernas = findViewById(R.id.u4a2aetPiernas);
        etColor = findViewById(R.id.u4a2aetColor);
        btnContruir = findViewById(R.id.u4a2abtnConstruir);
        fragment = (u4a2fMonstruo) getSupportFragmentManager().findFragmentById(R.id.u4a2fMonstruo);
        fragment1 = (u4a2fMonstruo) getSupportFragmentManager().findFragmentById(R.id.u4a2aFragMonstruo1);
        spnEleccion = findViewById(R.id.u4a2aspEleccion);

        btnContruir.setOnClickListener((View) -> {
            String nombre = etNombre.getText().toString();
            String cadenaManos = etManos.getText().toString();
            String cadenaPierna = etPiernas.getText().toString();
            String color = etColor.getText().toString();

            if(nombre.isEmpty()){
                etNombre.setText(ERROR_NOMBRE);
            } else if (cadenaManos.isEmpty()) {
                etManos.setText(ERROR_MANOS);
            } else if (cadenaPierna.isEmpty()) {
                etPiernas.setText(ERROR_PIERNAS);
            } else if (color.isEmpty()) {
                etColor.setText(ERROR_COLOR);
            }else {
                int numeroManos = Integer.valueOf(etManos.getText().toString());
                int numeroPiernas = Integer.valueOf(etPiernas.getText().toString());
                Monstruo monstruo = new Monstruo(nombre, numeroManos, numeroPiernas, color);

                if (spnEleccion.getSelectedItem().equals("MONSTRUO 1")) {
                    fragment1.pintaMonstruo(monstruo);
                } else if (spnEleccion.getSelectedItem().equals("MONSTRUO 2")) {
                    fragment2.pintaMonstruo(monstruo);
                } else if (spnEleccion.getSelectedItem().equals("MONSTRUO 3")) {
                    fragment3.pintaMonstruo(monstruo);
                } else if (spnEleccion.getSelectedItem().equals("MONSTRUO 4")) {
                    fragment4.pintaMonstruo(monstruo);
                }
            }
        });
    }
}