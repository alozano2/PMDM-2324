package com.ejemplo.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.widget.Button;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

public class u3a9aBotonesEnlace extends AppCompatActivity {
    public static final String URL_CANCION = "https://www.youtube.com/watch?v=RCJDY26yVcQ";
    public static final String CADENA_ERROR = "No se pudo realizar la acción";
    public static final String CADENA_SMS = "Te veo luego Paquito";
    public static final String NUMERO_PACO = "667445336";
    public static final String STRING_GEOLOCA = "geo:0,0?q=C.+de+la+Caoba,+1,+28005+Madrid";


    Button btnCancion, btnNumero, btnSMS, btnAbrirMapa, btnAlarma;
    TextView tvError;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a9a_botones_enlace);

        btnCancion = findViewById(R.id.u3a9abtnCancion);
        btnNumero = findViewById(R.id.u3a9abtnNumero);
        btnSMS = findViewById(R.id.u3a9abtnSMS);
        btnAbrirMapa = findViewById(R.id.u3a9abtnMapa);
        btnAlarma = findViewById(R.id.u3a9abtnAlarma);
        tvError = findViewById(R.id.u3a9atvError);

        btnCancion.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY, URL_CANCION);
            startActivity(intent);
        });

        btnNumero.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + "666765432"));
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            } else {
                tvError.setText(CADENA_ERROR);
            }
        });

        btnSMS.setOnClickListener(view -> {
            Uri uri = Uri.parse("smsto:" + NUMERO_PACO);
            Intent i = new Intent(Intent.ACTION_SENDTO, uri);
            i.putExtra("sms_body", CADENA_SMS);
            startActivity(i);
        });

        btnAbrirMapa.setOnClickListener(view -> {
            Uri uri = Uri.parse(STRING_GEOLOCA);
            Intent i = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(i);
        });

        btnAlarma.setOnClickListener(view -> {
            String mensaje = "DESPIERTAAAAAAA!";
            Integer hour = 13;
            Integer minutes = 11;

            Intent i = new Intent(AlarmClock.ACTION_SET_ALARM).
                    putExtra(AlarmClock.EXTRA_MESSAGE, mensaje).
                    putExtra(AlarmClock.EXTRA_HOUR, hour).
                    putExtra(AlarmClock.EXTRA_MINUTES, minutes);
            startActivity(i);
        });
    }
}