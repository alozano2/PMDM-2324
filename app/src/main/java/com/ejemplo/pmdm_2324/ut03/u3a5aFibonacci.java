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

public class u3a5aFibonacci extends AppCompatActivity {
    TextView tvNum1, tvNum2;
    Button btnSiguienteNumero;
    public static final String CLAVE_NUM1 = "NUM1";
    public static final String CLAVE_NUM2 = "NUM2";
    public static final String CLAVE_ERROR = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a5a_fibonacci);

        tvNum1 = findViewById(R.id.u3a5atvNum1);
        tvNum2 = findViewById(R.id.u3a5atvNum2);
        btnSiguienteNumero = findViewById(R.id.u3a5abtnSiguiente);

        tvNum1.setText("1");
        tvNum1.setTextColor(getResources().getColor(R.color.white));
        tvNum2.setText("1");
        tvNum2.setTextColor(getResources().getColor(R.color.white));

        ActivityResultLauncher <Intent> lanzador = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if(result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        tvNum1.setText(data.getStringExtra(u3a5bFibonacci.CLAVE_NUM2));
                        tvNum2.setText(data.getStringExtra(u3a5bFibonacci.CLAVE_RESULTADO));
                    }

                    if(result.getResultCode() == Activity.RESULT_CANCELED){
                        tvNum1.setText(CLAVE_ERROR);
                        tvNum2.setText(CLAVE_ERROR);
                    }
                }
        );

        btnSiguienteNumero.setOnClickListener(view -> {
            Intent i = new Intent(this, u3a5bFibonacci.class);
            i.putExtra(CLAVE_NUM1, tvNum1.getText().toString());
            i.putExtra(CLAVE_NUM2, tvNum2.getText().toString());
            lanzador.launch(i);
        });

    }
}
