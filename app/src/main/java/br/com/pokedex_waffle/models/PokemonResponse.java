package br.com.pokedex_waffle.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class PokemonResponse {

    @SerializedName("results")
    @Expose
    private ArrayList<Pokemon> results;

    @SerializedName("count")
    @Expose
    private int count;

    //GETTER`S AND SETTER`S
    public ArrayList<Pokemon> getResults() {
        return results;
    }

    public void setResults(ArrayList<Pokemon> results) {
        this.results = results;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
