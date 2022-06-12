package modulo03.ex03_livraria;

import java.util.List;

public interface IGerenciadorEstoque {

    void addProduto(Produto p);
    Produto mostrarProduto(Long id);
    void alterarProduto(Produto p);
    void removerProduto(Long id);
    List<Produto> mostrarEstoque();
    void mostrarEstoquePorCategoria(TipoProduto tipoProduto);
}
