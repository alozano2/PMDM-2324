package com.ejemplo.pmdm_2324.ut09;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import android.os.Bundle;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

public class ut09a1ActividadPokemon extends AppCompatActivity {
    TextView tvInfoPokemon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ut09a1_actividad_pokemon);

        PokeApiService apiService = (PokeApiService) ClienteRetrofit.getPokeApiService();
        Call<ut09a1Ability> blazeAbilityCall = apiService.getBlazeAbility();
        Call<ut09a1Pokemon> CharizardPokemonCall = apiService.getCharizarPokemon();
        //Call<ut09a1Pokemon> CharizardPokemonCall = apiService.getHeightCharizard();
        tvInfoPokemon = findViewById(R.id.ut09a1tvInfo);

        //Como hago para poder llamar a otros atributos de charizard
        CharizardPokemonCall.enqueue(new Callback<ut09a1Pokemon>() {
            @Override
            public void onResponse(Call<ut09a1Pokemon> call, Response<ut09a1Pokemon> response) {
                if (response.isSuccessful()) {
                    ut09a1Pokemon charizardPokemon = response.body();

                    // Mostrar información en el TextView
                    String pokemonInfo = "Nombre: " + charizardPokemon.getName() + "\n" +
                            "URL: " + charizardPokemon.getUrl() + "\n" +
                            "Movimiento 1: " + charizardPokemon.getHeight();

                    tvInfoPokemon.setText(pokemonInfo);
                } else {
                    // Manejar errores de respuesta
                    Log.e("MainActivity", "Error en la respuesta: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<ut09a1Pokemon> call, Throwable t) {
                // Manejar errores de red
                Log.e("MainActivity", "Error de red: " + t.getMessage());
            }
        });
    }
}