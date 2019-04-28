package br.com.pokedex_waffle.pokeapi;

import br.com.pokedex_waffle.models.PokemonResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PokeapiService {

    @GET("pokemon")
    Call<PokemonResponse> obterListaPokemon(@Query("limit") int limit, @Query("offset") int offset);
}
