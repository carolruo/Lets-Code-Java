package modulo02.exercicio_estoque;

public class Product {
    private static Integer sequentialKey = 1;
    private int id;
    private String productName;
    private String section;
    private String type;
    private String brand;
    private int quantityInStock;

    public Product(String name, String section, String type, String brand, int quantityInStock) {
        this.id = sequentialKey;
        sequentialKey++;
        this.productName = name;
        this.section = section;
        this.type = type;
        this.brand = brand;
        this.quantityInStock = quantityInStock;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public void updateName(String name) {
        this.productName = name;
    }

    public void updateSection(String section) {
        this.section = section;
    }

    public void updateType(String type) {
        this.type = type;
    }

    public void updateBrand(String brand) {
        this.brand = brand;
    }

    public void updateQuantityInStock(int quantity) {
        this.quantityInStock = quantity;
    }

    public Boolean equalsProduct(Product product) {
        if (this.productName.equals(product.getProductName())) {
            this.quantityInStock += product.quantityInStock;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Product " +
                "id: " + id +
                ", productName: " + productName +
                ", section: " + section +
                ", type:" + type +
                ", brand: " + brand +
                ", quantityInStock: " + quantityInStock;
    }
}
