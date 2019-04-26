package br.com.pokedex_waffle.pokeapi;

import br.com.pokedex_waffle.models.PokemonResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PokeapiService {

    @GET("pokemon")
    Call<PokemonResponse> obterListaPokemon();
}
