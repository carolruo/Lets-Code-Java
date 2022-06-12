package modulo03.ex03_livraria.main;

import modulo03.ex03_livraria.abstracts.Produto;
import modulo03.ex03_livraria.modelo.*;
import modulo03.ex03_livraria.utils.TipoProduto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteLivraria {
    public static void main(String[] args) {

        String genero = "gen";
        List<String> generos = new ArrayList<>();
        generos.add(genero);

        Brinquedo brinquedo1 = new Brinquedo(1l, "Boneca", 24.9, TipoProduto.BRINQUEDO,"bebes");
        Jogo jogo1 = new Jogo(2l, "Wow", 49, TipoProduto.JOGO, "Blizzard", "rpg", "Battlenet");
        Livro livro1 = new Livro(3l, "1984", 250, TipoProduto.LIVRO, generos,"asd", "asd");
        jogo1.setConteudoExplicito(true);
        List<Produto> listaProdutos = new ArrayList<>();
        GerenciadorEstoque estoque = new GerenciadorEstoque(listaProdutos);
        Livraria livraria = new Livraria("Livros Demais", estoque);

        listaProdutos.add(brinquedo1);
        listaProdutos.add(jogo1);
        listaProdutos.add(livro1);
        System.out.println(estoque.mostrarEstoque());

        estoque.removerProduto(1l);
        estoque.removerProduto(2l);
        listaProdutos.add(brinquedo1);

        Cliente cliente1 = new Cliente("jose", "123", "456", LocalDate.of(2010, 5, 17));

        Caixa caixa1 = new Caixa(1l, 500);
        Caixa.setEstoque(estoque);
        livraria.setCaixa(caixa1);

        System.out.println("Compra valor total: " + caixa1.compraValorTotal(listaProdutos, cliente1));

        System.out.println("Dinheiro do caixa: " + caixa1.getDinheiroCaixa());

        System.out.println("Cliente maior de 18? " + cliente1.getMaiorDeIdade());

        System.out.println("Estoque pós compra: " + estoque.mostrarEstoque());

    }
}
