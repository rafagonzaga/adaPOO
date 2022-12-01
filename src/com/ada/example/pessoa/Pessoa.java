package com.ada.example.pessoa;

import com.ada.example.dados.pessoais.Endereco;

public class Pessoa {

    private String nome;
    // private String matricula;
    private String email;
    Endereco endereco;

    public Pessoa(String nome, String email, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
