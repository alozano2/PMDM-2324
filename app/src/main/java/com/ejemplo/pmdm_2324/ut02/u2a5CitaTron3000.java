package com.ejemplo.pmdm_2324.ut02;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import com.ejemplo.pmdm_2324.R;
import android.widget.DatePicker;
import android.widget.TimePicker;
import java.util.Calendar;
import android.app.TimePickerDialog;
import java.util.Locale;
public class u2a5CitaTron3000 extends AppCompatActivity {

    Button btnDatePicker, btnHoraPicker, btnPedirCita;
    TextView tvDia, tvHora, tvDni, tvDatoIncorrecto, tvCitaRealizada;
    ImageView fotoTick;
    boolean datoIncorrecto;
    String hora, fechaCita, dni;
    public static final String DNI_INCORRECTO = "El DNI ingresado no es correcto o esta vacío.";
    public static final String FECHA_INCORRECTA = "La fecha ingresada no esta disponible";
    public static final String HORA_VACIA = "No has ingresado una hora o es incorrecta.";
    public static final String DATO_CORRECTO = " ";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u2a5_cita_tron3000);

        btnDatePicker = findViewById(R.id.u2a5btnBotonFecha);
        tvDia = findViewById(R.id.u2a5tvDia);
        tvDni = findViewById(R.id.u2a5etDni);
        btnPedirCita = findViewById(R.id.u2a5btnPedirCita);
        tvDatoIncorrecto = findViewById(R.id.u2a5etDniIncorrecto);
        tvCitaRealizada = findViewById(R.id.u2a5tvCitaRealizada);
        fotoTick = findViewById(R.id.u2a5imgCorrecto);

        btnDatePicker.setOnClickListener((View v) -> {
            final Calendar c = Calendar.getInstance();

            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            //Para mostrar la fecha
            DatePickerDialog datePickerDialog = new DatePickerDialog(

                    u2a5CitaTron3000.this,
                    (view, year1, monthOfYear, dayOfMonth) -> tvDia.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year1),
                    year, month, day);

            fechaCita = tvDia.getText().toString();
            datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis());
            datePickerDialog.show();
        });

        //Para mostrar la hora (timePicker)
        tvHora = findViewById(R.id.u2a5tvHora);
        btnHoraPicker = findViewById(R.id.u2a5btnHora);

        btnHoraPicker.setOnClickListener((View v) ->{
            final Calendar c = Calendar.getInstance();

            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minute = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(u2a5CitaTron3000.this,
                    (view, hourOfDay, minuteOfDay) -> {
                        if(hourOfDay == 0){
                            hora = (minuteOfDay < 10) ? "12:0" + minuteOfDay + " am" : "12:" + minuteOfDay + " am";
                        }else if(hourOfDay > 12){
                            hora = (minuteOfDay < 10) ? (hourOfDay) + ":0" + minuteOfDay + " pm" : (hourOfDay) + ":" + minuteOfDay + " pm";
                        } else if (hourOfDay == 12) {
                            hora = (minuteOfDay < 10) ? "12:0" + minuteOfDay + " pm" : "12:" + ":" + minuteOfDay + " pm";
                        }else{
                            hora = (minuteOfDay < 10) ? hourOfDay + ":0" + minuteOfDay + " am" : hourOfDay + ":" + minuteOfDay + " am";
                        }
                        tvHora.setText(hora);

                        if (hourOfDay >= 9 && hourOfDay < 14) {
                            //Formatear hora
                            String horaFormat = String.format(Locale.getDefault(), "%02d:%02d", hourOfDay, minute);
                            tvHora.setText(horaFormat);
                            hora=horaFormat;
                            tvDatoIncorrecto.setText("");
                            //Sin formato (original) = tvHora.setText(hourOfDay + ":" + minute);
                        }else{
                            tvDatoIncorrecto.setText(HORA_VACIA);
                        }
                    }, hour, minute, false);
            timePickerDialog.show();
        });

        //Presionar boton pedir cita
        btnPedirCita = findViewById(R.id.u2a5btnPedirCita);

        btnPedirCita.setOnClickListener((View v) -> {
            dni = tvDni.getText().toString();
            fechaCita = tvDia.getText().toString();
            hora = tvHora.getText().toString();

            if (dni.isEmpty() || dni.length() != 9 || !dni.substring(0, 8).matches("\\d+")){
                tvDatoIncorrecto.setText(DNI_INCORRECTO);
                datoIncorrecto = true;
            } else{
                tvDatoIncorrecto.setText(DATO_CORRECTO);
            }

            if(fechaCita.isEmpty()){
                tvDatoIncorrecto.setText(FECHA_INCORRECTA);
                datoIncorrecto = true;
            }

            if (hora.isEmpty()){
                tvDatoIncorrecto.setText(HORA_VACIA);
                datoIncorrecto = true;
            }

            if(datoIncorrecto == false){
                btnHoraPicker.setVisibility(View.GONE);
                btnDatePicker.setVisibility(View.GONE);
                tvDia.setVisibility(View.GONE);
                tvHora.setVisibility(View.GONE);
                btnPedirCita.setVisibility(View.GONE);
                tvDatoIncorrecto.setVisibility(View.GONE);

                fotoTick.setVisibility(View.VISIBLE);
                tvCitaRealizada.setText("Cita realizada con exito el dia: " + fechaCita + " a las " + hora);
                tvCitaRealizada.setVisibility(View.VISIBLE);
            }
        });
    }
}