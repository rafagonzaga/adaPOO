package com.ada.example.time;

public class Jogador {

    private String nome;
    private String posicao;
    private String numeroCamisa;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setNumeroCamisa(String numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", numeroCamisa='" + numeroCamisa + '\'' +
                '}';
    }
}
