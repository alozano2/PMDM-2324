package com.ejemplo.pmdm_2324.ut09;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokeApiService {
    @GET("ability/66/")
    Call<ut09a1Ability> getBlazeAbility();

    @GET("move/5/")
    Call<ut09a1Pokemon> getHeightCharizard();

    @GET("pokemon-form/6/")
    Call<ut09a1Pokemon> getCharizarPokemon();
}
