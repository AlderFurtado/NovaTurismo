package com.novaturistmo.novaturismo.Models;

public class CategoriaItem {
    private String nome;
    private int icone;

    public CategoriaItem(String nome, int icone) {
        this.nome = nome;
        this.icone = icone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIcone() {
        return icone;
    }

    public void setIcone(int icone) {
        this.icone = icone;
    }
}
