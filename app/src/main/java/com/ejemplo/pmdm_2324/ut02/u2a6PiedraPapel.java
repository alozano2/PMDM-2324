package com.ejemplo.pmdm_2324.ut02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class u2a6PiedraPapel extends AppCompatActivity {
    //Creo las variables
    TextView tvContadorJugador, tvContadorMaquina, tvTurno, tvGanaTurno, tvGanaste, tvPerdiste;
    ImageView imgViewPiedra, imgViewPapel, imgViewTijera, imgViewVictory, imgViewDefeat;
    Button btnReiniciar;
    final int PUNTUACION_MAXIMA = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u2a6_piedra_papel);

        //Asigno las variables a sus id:
        //variables textView
        tvContadorJugador = findViewById(R.id.u2a6tvContJugador);
        tvContadorMaquina = findViewById(R.id.u2a6tvContMaquina);
        tvTurno = findViewById(R.id.u2a6tvTurno);
        tvGanaTurno = findViewById(R.id.u2a6tvGanaTurno);
        tvGanaste = findViewById(R.id.u2a6tvGanaste);
        tvPerdiste = findViewById(R.id.u2a6tvDefeat);

        //Variable boton
        btnReiniciar = findViewById(R.id.u2a6btnReset);

        //Variables imageView
        imgViewPiedra = findViewById(R.id.u2a6imgViewPiedra);
        imgViewPapel = findViewById(R.id.u2a6imgViewPapel);
        imgViewTijera = findViewById(R.id.u2a6imgViewTijera);
        imgViewVictory = findViewById(R.id.u2a6imgViewVictory);
        imgViewDefeat = findViewById(R.id.u2a6imgViewDefeat);

        //Defino variables necesarias para que la app funcione
        AtomicInteger contadorJugador = new AtomicInteger();
        AtomicInteger contadorMaquina = new AtomicInteger();
        String cadenaVacia = " ";
        final numeros[] eleccionJugador = {null};

        imgViewPiedra.setOnClickListener((View v) -> {
            eleccionJugador[0] = numeros.OPCION_1; // El jugador elige Piedra
            jugar(eleccionJugador[0], contadorJugador, contadorMaquina);
        });

        imgViewPapel.setOnClickListener((View v) -> {
            eleccionJugador[0] = numeros.OPCION_2; // El jugador elige Papel
            jugar(eleccionJugador[0], contadorJugador, contadorMaquina);
        });

        imgViewTijera.setOnClickListener((View v) -> {
            eleccionJugador[0] = numeros.OPCION_3; // El jugador elige Tijera
            jugar(eleccionJugador[0], contadorJugador, contadorMaquina);
        });

        btnReiniciar.setOnClickListener((View v) -> {
            tvGanaTurno.setText(cadenaVacia);
            tvTurno.setText(cadenaVacia);
            tvContadorMaquina.setText(cadenaVacia);
            tvContadorJugador.setText(cadenaVacia);
            contadorMaquina.set(0);
            contadorJugador.set(0);
        });
    }
        private void jugar (numeros eleccionJugador, AtomicInteger contadorJugador, AtomicInteger contadorMaquina) {

            int numeroAleatorio = new Random().nextInt(3);
            numeros eleccionMaquina = null;
            switch (numeroAleatorio) {
                case 0:
                    eleccionMaquina = numeros.OPCION_1; // Máquina elige piedra
                    break;
                case 1:
                    eleccionMaquina = numeros.OPCION_2; // Máquina elige papel
                    break;
                case 2:
                    eleccionMaquina = numeros.OPCION_3; // Máquina elige tijera
                    break;
            }

            if (eleccionJugador == eleccionMaquina) {
                // Empate
                tvGanaTurno.setText("Has empatado.");
            } else if ((eleccionJugador == numeros.OPCION_1 && eleccionMaquina == numeros.OPCION_3)
                    || (eleccionJugador == numeros.OPCION_2 && eleccionMaquina == numeros.OPCION_1)
                    || (eleccionJugador == numeros.OPCION_3 && eleccionMaquina == numeros.OPCION_2)) {
                // El jugador gana
                tvGanaTurno.setText("Has ganado.");
                contadorJugador.incrementAndGet();
            } else {
                // La maquina gana
                tvGanaTurno.setText("Has perdido.");
                contadorMaquina.incrementAndGet();
            }

            tvContadorJugador.setText(String.valueOf(contadorJugador.get()));
            tvContadorMaquina.setText(String.valueOf(contadorMaquina.get()));

            if(contadorJugador.get() == PUNTUACION_MAXIMA){
                imgViewPiedra.setOnClickListener(null);
                imgViewPapel.setOnClickListener(null);
                imgViewTijera.setOnClickListener(null);
                imgViewPiedra.setVisibility(View.GONE);
                imgViewPapel.setVisibility(View.GONE);
                imgViewTijera.setVisibility(View.GONE);
                btnReiniciar.setVisibility(View.GONE);
                tvTurno.setVisibility(View.GONE);
                tvGanaTurno.setVisibility(View.GONE);
                tvGanaste.setVisibility(View.VISIBLE);
                imgViewVictory.setVisibility(View.VISIBLE);
            } else if (contadorMaquina.get() == PUNTUACION_MAXIMA) {
                imgViewPiedra.setOnClickListener(null);
                imgViewPapel.setOnClickListener(null);
                imgViewTijera.setOnClickListener(null);
                imgViewPiedra.setVisibility(View.GONE);
                imgViewPapel.setVisibility(View.GONE);
                imgViewTijera.setVisibility(View.GONE);
                btnReiniciar.setVisibility(View.GONE);
                tvTurno.setVisibility(View.GONE);
                tvGanaTurno.setVisibility(View.GONE);
                tvPerdiste.setVisibility(View.VISIBLE);
                imgViewDefeat.setVisibility(View.VISIBLE);
            }
        }

    public enum numeros {
        OPCION_1, OPCION_2, OPCION_3
    }
}