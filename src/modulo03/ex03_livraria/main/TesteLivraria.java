package modulo03.ex03_livraria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteLivraria {
    public static void main(String[] args) {

        Brinquedo brinquedo1 = new Brinquedo(1l, "Boneca", 24.9, TipoProduto.BRINQUEDO,"bebes");
        List<Produto> listaProdutos = new ArrayList<>();
        GerenciadorEstoque estoque = new GerenciadorEstoque(listaProdutos);
        Livraria livraria = new Livraria("Livros Demais", estoque);

        listaProdutos.add(brinquedo1);
        System.out.println(estoque.mostrarEstoque());

        estoque.removerProduto(1l);
        listaProdutos.add(brinquedo1);

        Caixa caixa1 = new Caixa(1l, 500, estoque);
        livraria.setCaixa(caixa1);
        caixa1.compraTotal(listaProdutos);

        System.out.println(estoque.mostrarEstoque());

        Cliente cliente1 = new Cliente("jose", "123", "456", LocalDate.of(1961, 5, 17));

        System.out.println(cliente1.getMaiorDeIdade());

    }
}
