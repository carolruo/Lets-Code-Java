package modulo03.ex03_livraria.modelo;

import modulo03.ex03_livraria.abstracts.Product;
import modulo03.ex03_livraria.utils.ProductType;

public class Toy extends Product {

    private String type;

    public Toy(Long id, String name, double price, ProductType productType, String type) {
        super(id, name, price, productType);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Toy{" + super.toString() +
                "type='" + type + '\'' +
                "} ";
    }
}
