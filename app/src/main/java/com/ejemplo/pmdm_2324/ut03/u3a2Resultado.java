package com.ejemplo.pmdm_2324.ut03;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

public class u3a2Resultado extends AppCompatActivity {
    int resultado;
    TextView tvResultado;
    boolean esCero = false;
    ImageView imgTriste, imgContenta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a2_resultado);

        tvResultado = findViewById(R.id.u3a2tvResultado);
        imgTriste = findViewById(R.id.u3a2imgTriste);
        imgContenta = findViewById(R.id.u3a2imgContenta);

        Bundle info = getIntent().getExtras();
        String op1=info.getString(u3a2aCalcula.INFO_NUM1);
        Integer num1 = Integer.parseInt(op1);
        String op2=info.getString(u3a2aCalcula.INFO_NUM2);
        Integer num2 = Integer.parseInt(op2);
        String operator = info.getString(u3a2aCalcula.OPERADOR);

        if(operator.equals("+")){
            resultado = num1 + num2;
        } else if (operator.equals("-")) {
            if(num1 > num2){
                resultado = num1 - num2;
            }else{
                resultado = num2 - num1;
            }
        } else if (operator.equals("*")) {
            resultado = num1 * num2;
        } else if (operator.equals("/")) {
            if(num2 == 0){
                esCero = true;
            }else {
                resultado = (int) (double) num1 / num2;
            }
        }

        if(esCero == true) {
            AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setTitle("Error");
            alerta.setMessage("No se puede realizar una division entre 0");
            alerta.show();
            imgTriste.setVisibility(View.VISIBLE);
        }else{
            tvResultado.setText(String.valueOf(resultado));
            imgContenta.setVisibility(View.VISIBLE);
        }
    }
}