package modulo03.ex03_livraria.abstracts;

import modulo03.ex03_livraria.utils.ProductType;

public abstract class Product {

    private Long id;
    private String name;
    private double price;
    private ProductType productType;
    private boolean isExplicitContent = false;

    public Product(Long id, String name, double price, ProductType productType) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productType = productType;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductType getProductType() {
        return productType;
    }

    public boolean isExplicitContent() {
        return isExplicitContent;
    }

    public void setExplicitContent(boolean explicitContent) {
        isExplicitContent = explicitContent;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + name + '\'' +
                ", preco=" + price +
                '}';
    }
}
