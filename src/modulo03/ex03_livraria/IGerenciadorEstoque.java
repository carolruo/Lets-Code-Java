package modulo03.ex03_livraria;

public interface IGerenciadorEstoque {

    void addProduto(Produto p);
    void mostrarProduto(Long id);
    void alterarProduto();
    void removerProduto();
    void mostrarEstoque();
    void mostrarEstoquePorCategoria();
}
