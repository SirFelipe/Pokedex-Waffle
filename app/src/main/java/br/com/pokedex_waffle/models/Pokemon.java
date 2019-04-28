package br.com.pokedex_waffle.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pokemon {


    private int number;

    @SerializedName("name")
    @Expose
    private String nome;

    @SerializedName("url")
    @Expose
    private String url;

    //GETTER`S AND SETTER`S
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNumber() {
        String[] urlPartes = url.split("/");
        return Integer.parseInt(urlPartes[urlPartes.length - 1]);
    }

    public void setNumber(int number) { this.number = number; }
}
