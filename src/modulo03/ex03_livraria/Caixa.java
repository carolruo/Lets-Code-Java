package modulo03.ex03_livraria;

public class Caixa implements ICaixa{

    private Long id;
    private double dinheiro;

    public Caixa(Long id, double dinheiro) {
        this.id = id;
        this.dinheiro = dinheiro;
    }

    public Long getId() {
        return id;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    @Override
    public void fecharCompra() {

    }
}
