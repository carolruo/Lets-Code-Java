package modulo03.ex03_livraria.interfaces;

import modulo03.ex03_livraria.abstracts.Product;
import modulo03.ex03_livraria.modelo.Customer;

import java.util.List;

public interface ICashier {

    double purchaseTotal(List<Product> products, Customer customer);

}
