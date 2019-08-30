package com.novaturistmo.novaturismo.Models;

public class Ponto {

    private String id_ponto;
    private String nome;
    private int foto;
    private String hora_funcionamento;
    private String descricao_breve;
    private String descricao_completa;
    private int nota_avaliacao;
    private boolean visitado;
    private boolean na_programacao;
    private double latitude;
    private double longitude;
    private double pontuacao;

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public Ponto(String nome, int foto) {
        this.nome = nome;
        this.foto = foto;
    }

    public Ponto(String id_ponto, String nome, int foto, String hora_funcionamento, String descricao_breve, String descricao_completa, int nota_avaliacao, boolean visitado, boolean na_programacao, double latitude, double longitude, double pontuacao) {

        this.id_ponto = id_ponto;
        this.nome = nome;
        this.foto = foto;
        this.hora_funcionamento = hora_funcionamento;
        this.descricao_breve = descricao_breve;
        this.descricao_completa = descricao_completa;
        this.nota_avaliacao = nota_avaliacao;
        this.visitado = visitado;
        this.na_programacao = na_programacao;
        this.latitude = latitude;
        this.longitude = longitude;
        this.pontuacao = pontuacao;
    }

    public String getId_ponto() {
        return id_ponto;
    }

    public void setId_ponto(String id_ponto) {
        this.id_ponto = id_ponto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHora_funcionamento() {
        return hora_funcionamento;
    }

    public void setHora_funcionamento(String hora_funcionamento) {
        this.hora_funcionamento = hora_funcionamento;
    }

    public String getDescricao_breve() {
        return descricao_breve;
    }

    public void setDescricao_breve(String descricao_breve) {
        this.descricao_breve = descricao_breve;
    }

    public String getDescricao_completa() {
        return descricao_completa;
    }

    public void setDescricao_completa(String descricao_completa) {
        this.descricao_completa = descricao_completa;
    }

    public int getNota_avaliacao() {
        return nota_avaliacao;
    }

    public void setNota_avaliacao(int nota_avaliacao) {
        this.nota_avaliacao = nota_avaliacao;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public boolean isNa_programacao() {
        return na_programacao;
    }

    public void setNa_programacao(boolean na_programacao) {
        this.na_programacao = na_programacao;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }
}
