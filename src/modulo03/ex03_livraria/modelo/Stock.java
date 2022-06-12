package modulo03.ex03_livraria.modelo;

import modulo03.ex03_livraria.interfaces.IStock;
import modulo03.ex03_livraria.abstracts.Product;
import modulo03.ex03_livraria.utils.ProductType;

import java.util.List;

public class Stock implements IStock {

    private List<Product> products;

    public Stock(List<Product> products) {
        this.products = products;
    }

    @Override
    public void addProduct(Product p) {
        products.add(p);
    }

    @Override
    public Product getProduct(Long id) {
        for (Product produto : products) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    @Override
    public void updateProduct(Product p) {
        products.forEach(product -> {
            if (product.getId() == p.getId()) {
                product = p;
            }
        });
    }

    @Override
    public void removeProduct(Long id) {
        Product product = getProduct(id);
        products.remove(product);
    }

    @Override
    public List<Product> getStock() {
        return products;
    }

    @Override
    public void getStockByCategory(ProductType productType) {
        products.forEach(product -> {
            if (product.getProductType().equals(productType)) {
                System.out.println(product);
            }
        });

    }
}
