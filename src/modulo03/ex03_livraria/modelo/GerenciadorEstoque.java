package modulo03.ex03_livraria.modelo;

import modulo03.ex03_livraria.interfaces.IGerenciadorEstoque;
import modulo03.ex03_livraria.abstracts.Produto;
import modulo03.ex03_livraria.utils.TipoProduto;

import java.util.List;

public class GerenciadorEstoque implements IGerenciadorEstoque {

    private List<Produto> produtos;

    public GerenciadorEstoque(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public void addProduto(Produto p) {
        produtos.add(p);
    }

    @Override
    public Produto mostrarProduto(Long id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    @Override
    public void alterarProduto(Produto p) {
        produtos.forEach(produto -> {
            if (produto.getId() == p.getId()) {
                produto = p;
            }
        });
    }

    @Override
    public void removerProduto(Long id) {
        Produto produto = mostrarProduto(id);
        produtos.remove(produto);
    }

    @Override
    public List<Produto> mostrarEstoque() {
        return produtos;
    }

    @Override
    public void mostrarEstoquePorCategoria(TipoProduto tipoProduto) {
        produtos.forEach(produto -> {
            if (produto.getTipoProduto().equals(tipoProduto)) {
                System.out.println(produto);
            }
        });

    }
}
