package modulo03.ex03_livraria;

import java.util.List;

public class Livraria {

    private String nome;
    private  Caixa caixa;
    private List<Produto> produtos;

    public Livraria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
