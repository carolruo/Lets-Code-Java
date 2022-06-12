package modulo03.ex03_livraria;

public abstract class Produto {

    private Long id;
    private String nome;
    private double preco;
    private TipoProduto tipoProduto;
    private boolean isConteudoExplicito = false;

    public Produto(Long id, String nome, double preco, TipoProduto tipoProduto) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.tipoProduto = tipoProduto;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public boolean isConteudoExplicito() {
        return isConteudoExplicito;
    }

    //Por padrão, nessa atualização o produto que for 18+ tem que ser setado
    public void setConteudoExplicito(boolean conteudoExplicito) {
        isConteudoExplicito = conteudoExplicito;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
