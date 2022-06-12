package modulo03.ex03_livraria.modelo;

import modulo03.ex03_livraria.abstracts.Produto;

import java.util.List;

public class Compra {

    private List<Produto> compras;
    private double valorTotal = 0;
    private Cliente cliente;

    public Compra(List<Produto> compras, Cliente cliente) {
        this.compras = compras;
        this.cliente = cliente;
    }

    public Compra(List<Produto> compras) {
        this.compras = compras;
    }

    public List<Produto> getCompras() {
        return compras;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
