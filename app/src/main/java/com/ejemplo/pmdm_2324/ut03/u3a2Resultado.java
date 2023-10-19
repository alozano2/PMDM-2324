package com.ejemplo.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

public class u3a2Resultado extends AppCompatActivity {
    TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a2_resultado);

        Bundle info = getIntent().getExtras();

        String operador = info.getString(u3a2aCalcula.OPERADOR);
        int num1 = Integer.valueOf(info.getString(u3a2aCalcula.INFO_NUM1));
        int num2 = Integer.valueOf(info.getString(u3a2aCalcula.INFO_NUM2));
        double resultado = 0;
        tvResultado = findViewById(R.id.u3a2tvResultado);

        if(operador.equals("+")){
            resultado = num1 + num2;
            tvResultado.setText(String.valueOf(resultado));
        } else if (operador.equals("-")) {
            if(num1 > num2){
                resultado = num2 - num1;
                tvResultado.setText(String.valueOf(resultado));
            }else{
                resultado = num1 - num2;
                tvResultado.setText(String.valueOf(resultado));
            }
        } else if (operador.equals("*")) {
            resultado = num1 * num2;
            tvResultado.setText(String.valueOf(resultado));
        } else if (operador.equals("/")) {
            if(num2 != 0){
                resultado = num1 / num2;
                tvResultado.setText(String.valueOf(resultado));
            }else{
                tvResultado.setText("No es posible realizar la division entre cero.");
            }
        }

    }
}