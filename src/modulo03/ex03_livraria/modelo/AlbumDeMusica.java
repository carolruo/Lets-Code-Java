package modulo03.ex03_livraria.modelo;

import modulo03.ex03_livraria.abstracts.Produto;
import modulo03.ex03_livraria.utils.TipoProduto;

import java.util.List;

public class AlbumDeMusica extends Produto {

    private String banda;
    private List<String> generos;
    private List<String> selos;

    public AlbumDeMusica(Long id, String nome, double preco, TipoProduto tipoProduto, String banda, List<String> generos, List<String> selos) {
        super(id, nome, preco, tipoProduto);
        this.banda = banda;
        this.generos = generos;
        this.selos = selos;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public List<String> getSelos() {
        return selos;
    }

    public void setSelos(List<String> selos) {
        this.selos = selos;
    }
}