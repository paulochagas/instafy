package br.com.alura.instafy.modelos;

public class Audio {
    private String titulo;
     private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void reproduzir(){
        this.totalReproducoes++;
    }

    public void curtir() {
        this.totalCurtidas++;
    }
}
