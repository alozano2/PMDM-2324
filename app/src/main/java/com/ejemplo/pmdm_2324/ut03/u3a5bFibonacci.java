package com.ejemplo.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

public class u3a5bFibonacci extends AppCompatActivity {
    Button btnAceptar;
    TextView tvSuma;
    int num1Int, num2Int, resultado;
    public static final String CLAVE_RESULTADO = "RESULTADOSUMA";
    public static final String CLAVE_NUM2 = "NUM2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a5b_fibonacci);

        btnAceptar = findViewById(R.id.u3a5bBtnAceptar);
        tvSuma = findViewById(R.id.u3a5btvSuma);

        Intent i = getIntent();
        if(i != null){
            //Cojo los numeros y realizo la suma.
            String sNum1 = i.getStringExtra(u3a5aFibonacci.CLAVE_NUM1);
            num1Int = Integer.valueOf(sNum1);
            String sNum2 = i.getStringExtra(u3a5aFibonacci.CLAVE_NUM2);
            num2Int = Integer.valueOf(sNum2);
            resultado = num1Int + num2Int;

            //Muestro la suma en el TextView
            tvSuma.setText(num1Int + " + " + num2Int + " = " + resultado);

            //Lo paso a la otra actividad
            i.putExtra(CLAVE_RESULTADO,String.valueOf(resultado).toString());
            i.putExtra(CLAVE_NUM2, String.valueOf(num2Int).toString());
        }

        btnAceptar.setOnClickListener(view -> {
            setResult(Activity.RESULT_OK, i);
            finish();
        });
    }
}