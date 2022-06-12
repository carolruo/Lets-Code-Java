package modulo03.ex03_livraria.modelo;

import modulo03.ex03_livraria.interfaces.ICaixa;
import modulo03.ex03_livraria.abstracts.Produto;
import modulo03.ex03_livraria.utils.TipoProduto;

import java.util.List;

public class Caixa implements ICaixa {

    private Long id;
    private double dinheiroCaixa;
    private double valorCompra;
    private static GerenciadorEstoque estoque;

    public Caixa(Long id, double dinheiro) {
        this.id = id;
        this.dinheiroCaixa = dinheiro;

    }

    public Long getId() {
        return id;
    }

    public double getDinheiroCaixa() {
        return dinheiroCaixa;
    }

    public static void setEstoque(GerenciadorEstoque estoque) {
        Caixa.estoque = estoque;
    }

    @Override
    public double compraValorTotal(List<Produto> listaCompra, Cliente cliente) {
        valorCompra = 0;
        for (Produto produto : listaCompra) {
            if (produto.isConteudoExplicito() && cliente.getMaiorDeIdade()) {
                valorCompra += produto.getPreco();
            } else if (produto.isConteudoExplicito() && cliente.getMaiorDeIdade() == false) {
                System.out.println("Produto proibido para menores");
            } else {
                valorCompra += produto.getPreco();
            }
            estoque.removerProduto(produto.getId());
        };

        descontoLivros(listaCompra);
        dinheiroCaixa += valorCompra;
        return valorCompra;
    }

    private double descontoLivros(List<Produto> lista) {
        double valorEmLivros = 0;
        for (Produto produto : lista) {
            if (produto.getTipoProduto() == TipoProduto.LIVRO) valorEmLivros += produto.getPreco();
        }
        if (valorEmLivros >= 200) valorCompra -= valorCompra * 0.15;
        return  valorCompra;
    }
}
