package br.edu.ifms.carros.util;

public class Carro {
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private int foto;
    private String urlFoto;

    public Carro(int id, String marca, String modelo, int ano, int foto, String urlFoto) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.foto = foto;
        this.urlFoto = urlFoto;
    }

    @Override
    public String toString() {
        return String.format("%s %s/%s", marca, modelo, ano);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
}
