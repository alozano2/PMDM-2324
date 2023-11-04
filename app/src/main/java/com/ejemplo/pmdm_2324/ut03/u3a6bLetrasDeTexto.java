package com.ejemplo.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.ejemplo.pmdm_2324.R;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class u3a6bLetrasDeTexto extends AppCompatActivity {
    Button btnFinalizar;
    public static final String CLAVE_PRIMERA = "MASUSADA";
    public static final String CLAVE_SEGUNDA = "2MASUSADA";
    public static final String CLAVE_TERCERA = "3MASUSADA";
    public static final String CLAVE_NUMERO_PRIMERA = "NUMLETRA1";
    public static final String CLAVE_NUMERO_SEGUNDA = "NUMLETRA2";
    public static final String CLAVE_NUMERO_TERCERA = "NUMLETRA3";
    LinkedHashMap<String, Integer> cuentaLetras = new LinkedHashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a6b_letras_de_texto2);

        btnFinalizar = findViewById(R.id.u3a6bbtnFinalizar);
        Intent i = getIntent();
        if (i != null) {
            String frase = i.getStringExtra(u3a6aLetrasDeTexto.CLAVE_FRASE);
            frase.toLowerCase();

            // Divido la frase en distintas letras y cuento las apariciones.
            for (int f = 0; f < frase.length(); f++) {
                String letra = frase.substring(f, f + 1);
                if (!letra.equals(" ")) {
                    cuentaLetras.put(letra, cuentaLetras.getOrDefault(letra, 0) + 1);
                }
            }
            // Ordenar el mapa por la cantidad de apariciones de manera descendente.
            cuentaLetras = cuentaLetras.entrySet()
                    .stream()
                    .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (e1, e2) -> e1,
                            LinkedHashMap::new
                    ));
        }
        
        StringBuilder resultado = new StringBuilder();
        for (Map.Entry<String, Integer> entry : cuentaLetras.entrySet()) {
            resultado.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }

        btnFinalizar.setOnClickListener(view -> {
            // Enviar los resultados a la actividad principal.
            ArrayList<String> letras = new ArrayList<>(cuentaLetras.keySet());

            i.putExtra(CLAVE_PRIMERA, letras.get(0));
            i.putExtra(CLAVE_NUMERO_PRIMERA, cuentaLetras.get(letras.get(0)));
            i.putExtra(CLAVE_SEGUNDA, letras.get(1));
            i.putExtra(CLAVE_NUMERO_SEGUNDA, cuentaLetras.get(letras.get((1))));
            i.putExtra(CLAVE_TERCERA, letras.get(2));
            i.putExtra(CLAVE_NUMERO_TERCERA, cuentaLetras.get(letras.get((2))));

            setResult(Activity.RESULT_OK, i);
            finish();
        });
    }
}