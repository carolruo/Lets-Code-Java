package modulo03.ex03_livraria.modelo;

import modulo03.ex03_livraria.interfaces.ICashier;
import modulo03.ex03_livraria.abstracts.Product;
import modulo03.ex03_livraria.utils.ProductType;

import java.util.List;

public class Cashier implements ICashier {

    private Long id;
    private double cashierMoney;
    private double purchasePrice;
    private static Stock stock;

    public Cashier(Long id, double cashierMoney) {
        this.id = id;
        this.cashierMoney = cashierMoney;

    }

    public Long getId() {
        return id;
    }

    public double getCashierMoney() {
        return cashierMoney;
    }

    public static void setStock(Stock stock) {
        Cashier.stock = stock;
    }

    @Override
    public double purchaseTotal(List<Product> purchaseList, Customer customer) {
        purchasePrice = 0;
        for (Product product : purchaseList) {
            if (product.isExplicitContent() && customer.getOfAge()) {
                purchasePrice += product.getPrice();
            } else if (product.isExplicitContent() && customer.getOfAge() == false) {
                System.out.println("Produto proibido para menores");
            } else {
                purchasePrice += product.getPrice();
            }
            stock.removeProduct(product.getId());
        };

        discountOnBooks(purchaseList);
        cashierMoney += purchasePrice;
        return purchasePrice;
    }

    private double discountOnBooks(List<Product> purchaseList) {
        double totalBooksPrice = 0;
        for (Product product : purchaseList) {
            if (product.getProductType() == ProductType.LIVRO) totalBooksPrice += product.getPrice();
        }
        if (totalBooksPrice >= 200) purchasePrice -= purchasePrice * 0.15;
        return purchasePrice;
    }
}
