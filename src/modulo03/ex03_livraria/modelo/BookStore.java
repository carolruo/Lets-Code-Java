package modulo03.ex03_livraria.modelo;

public class BookStore {

    private String name;
    private Cashier cashier;
    private Stock stock;

    public BookStore(String name, Stock stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public Stock getStock() {
        return stock;
    }
}
