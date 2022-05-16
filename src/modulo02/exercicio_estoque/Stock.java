package modulo02.exercicio_estoque;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stock {
    private static Integer sequentialKey = 1;
    private int id;
    private String stockName;
    private List<Product> products;

    public Stock(String name, List<Product> products) {
        this.id = sequentialKey;
        sequentialKey++;
        this.stockName = name;
        this.products = products;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getId() {
        return id;
    }

    public void addProduct(Product product) {

        List<Product> productsIterator = new ArrayList<Product>();
        for (Iterator<Product> it = products.iterator(); it.hasNext(); ) {
            Product productIt = it.next();

            boolean is = productIt.equalsProduct(product);

            if (!is) {
                productsIterator.add(product);
                break;
            }
        }
        products.addAll(productsIterator);

        if (products.size() == 0) {
            products.add(product);
        }
    }

    public void removeProduct(Integer id) {

        Iterator<Product> it = products.iterator();
        while (it.hasNext()) {
            Product product = it.next();

            if (product.getId() == id) {
                it.remove();
            }
        }
    }

    public String getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product.toString();
            }
        }
        return "Not found";
    }

    public void getProductsInStock() {
        for (Product product : products) {
            System.out.println(product.getProductName());
        }
    }
}