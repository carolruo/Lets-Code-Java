package modulo03.ex03_livraria.interfaces;

import modulo03.ex03_livraria.abstracts.Product;
import modulo03.ex03_livraria.utils.ProductType;

import java.util.List;

public interface IStock {

    void addProduct(Product p);
    Product getProduct(Long id);
    void updateProduct(Product p);
    void removeProduct(Long id);
    List<Product> getStock();
    void getStockByCategory(ProductType tipoProduto);
}
