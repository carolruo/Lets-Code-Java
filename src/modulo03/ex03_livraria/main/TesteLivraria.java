package modulo03.ex03_livraria.main;

import modulo03.ex03_livraria.abstracts.Product;
import modulo03.ex03_livraria.modelo.*;
import modulo03.ex03_livraria.utils.ProductType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteLivraria {
    public static void main(String[] args) {

        String genero = "gen";
        List<String> generos = new ArrayList<>();
        generos.add(genero);

        Toy brinquedo1 = new Toy(1l, "Boneca", 24.9, ProductType.BRINQUEDO,"bebes");
        Game jogo1 = new Game(2l, "Wow", 49, ProductType.JOGO, "Blizzard", "rpg", "Battlenet");
        Book livro1 = new Book(3l, "1984", 250, ProductType.LIVRO, generos,"asd", "asd");
        jogo1.setExplicitContent(true);
        List<Product> listaProdutos = new ArrayList<>();
        Stock estoque = new Stock(listaProdutos);
        BookStore livraria = new BookStore("Livros Demais", estoque);

        listaProdutos.add(brinquedo1);
        listaProdutos.add(jogo1);
        listaProdutos.add(livro1);
        System.out.println(estoque.getStock());

//        estoque.removeProduct(1l);
//        estoque.removeProduct(2l);
//        listaProdutos.add(brinquedo1);

        Customer cliente1 = new Customer("jose", "123", "456", LocalDate.of(2010, 5, 17));

        Cashier caixa1 = new Cashier(1l, 500);
        Cashier.setStock(estoque);
        livraria.setCashier(caixa1);

        System.out.println("Compra valor total: " + caixa1.purchaseTotal(listaProdutos, cliente1));

        System.out.println("Dinheiro do caixa: " + caixa1.getCashierMoney());

        System.out.println("Cliente maior de 18? " + cliente1.getOfAge());

        System.out.println("Estoque pós compra: " + estoque.getStock());

    }
}
