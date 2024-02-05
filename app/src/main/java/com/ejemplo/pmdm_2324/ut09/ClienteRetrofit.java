package com.ejemplo.pmdm_2324.ut09;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClienteRetrofit {
    private static final String BASE_URL = "https://pokeapi.co/api/v2/";

    public static PokeApiService getPokeApiService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(PokeApiService.class);
    }
}
