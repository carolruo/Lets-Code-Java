package modulo02.exercicio_estoque;

import java.util.ArrayList;
import java.util.List;

public class TesteEstoque {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        Stock stock = new Stock("estoque1", products);

        Product product = new Product("coffee", "beverages", "cafeine", "Starbucks", 15);
        Product productTeste = new Product("coffee", "beverages", "cafeine", "Starbucks", 15);
        stock.addProduct(product);
        stock.addProduct(productTeste);

        Product product0 = new Product("refri", "drinks", "refri", "Fanta", 15);
        stock.addProduct(product0);

        Product product1 = new Product("ketchup", "condiments", "saude", "Hellmans", 15);
        stock.addProduct(product1);

        Product product2 = new Product("packaged bread", "breads", "bagels", "Superbread", 15);
        stock.addProduct(product2);

//        System.out.println("---------REMOVENDO----------");
//        stock.removeProduct(1);
//        stock.removeProduct(4);

        String readProduct = stock.getProductById(1);
        System.out.println("rEADING product in stock by id: " + readProduct);

        System.out.println("--------All products----------");
        stock.getProductsInStock();

        System.out.println("--------UPDATING----------");
        product.updateName("coffeé");
        product.updateSection("beber");
        product.updateType("energetic");
        product.updateBrand("3 Coraçoes");
        product.updateQuantityInStock(10);

        String updatedProduct = stock.getProductById(1);
        System.out.println("Updated coffee: " + updatedProduct);
    }
}