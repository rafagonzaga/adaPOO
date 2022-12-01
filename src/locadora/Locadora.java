package locadora;

import java.util.ArrayList;
import java.util.List;

public class Locadora {

    private String nomeLocadora;
    private String cnpj;
    private List<Filme> filmes;

    public Locadora() {
    }

    public Locadora(String nomeLocadora, String cnpj, List<Filme> filmes) {
        this.nomeLocadora = nomeLocadora;
        this.cnpj = cnpj;
        this.filmes = filmes;
    }

    public Locadora(String nomeLocadora, String cnpj) {
        this.nomeLocadora = nomeLocadora;
        this.cnpj = cnpj;
        this.filmes = new ArrayList<>(); // Para poder utilizar os metodos de cadastrar e remover
    }

    public String getNomeLocadora() {
        return nomeLocadora;
    }

    public void setNomeLocadora(String nomeLocadora) {
        this.nomeLocadora = nomeLocadora;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void cadastrarFilme(Filme filme){
        this.filmes.add(filme);
    }

    public void listarFilmes(){
        for(Filme filme : filmes){
            System.out.println(filme);
        }
    }

    public void removerFilme(Filme filme){

    }


}
