package com.ejemplo.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.ejemplo.pmdm_2324.R;

public class u3a2aCalcula extends AppCompatActivity {
    public static final String INFO_NUM1 = "CLAVE_NUM";
    public static final String INFO_NUM2 = "CLAVE_NUM";
    public static final String OPERADOR = "CLAVE_NUM";

    EditText etNumero1, etNumero2;
    RadioButton radiobtnSuma, radiobtnResta, radiobtnMultiplica, radiobtnDiv, r;
    Button btnCalcular;
    RadioGroup opcionSeleccionada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a2a_calcula);

        etNumero1 = findViewById(R.id.u3a2txtNum1);
        etNumero2 = findViewById(R.id.u3a2txtNum2);
        radiobtnSuma = findViewById(R.id.u3a2radiobtnSuma);
        radiobtnResta = findViewById(R.id.u3a2radiobtnResta);
        radiobtnMultiplica = findViewById(R.id.u3a2radiobtnMult);
        radiobtnDiv = findViewById(R.id.u3a2radiobtnDiv);
        btnCalcular = findViewById(R.id.u3a2btnCalcular);
        opcionSeleccionada = findViewById(R.id.u3a2radiogrpOp);

        btnCalcular.setOnClickListener(view -> {
            r = findViewById(opcionSeleccionada.getCheckedRadioButtonId());

            Intent i = new Intent(this, u3a2Resultado.class);
            i.putExtra(INFO_NUM1, etNumero1.getText().toString());
            i.putExtra(INFO_NUM2, etNumero2.getText().toString());
            i.putExtra(OPERADOR, r.getText().toString());
            startActivity(i);
        });
    }
}