package modulo03.ex03_livraria;

import java.util.List;

public class GerenciadorEstoque implements IGerenciadorEstoque {

    private List<Produto> produtos;

    @Override
    public void addProduto(Produto p) {
        produtos.add(p);
    }

    @Override
    public void mostrarProduto(Long id) {
        produtos.forEach(produto -> {
            if (produto.getId() == id) {
                System.out.println(produto);
            }
        });

    }

    @Override
    public void alterarProduto() {

    }

    @Override
    public void removerProduto() {

    }

    @Override
    public void mostrarEstoque() {

    }

    @Override
    public void mostrarEstoquePorCategoria() {

    }
}
