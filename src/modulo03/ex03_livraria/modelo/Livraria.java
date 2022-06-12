package modulo03.ex03_livraria.modelo;

public class Livraria {

    private String nome;
    private  Caixa caixa;
    private GerenciadorEstoque estoque;

    public Livraria(String nome, GerenciadorEstoque estoque) {
        this.nome = nome;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public GerenciadorEstoque getEstoque() {
        return estoque;
    }
}
