package modulo03.ex03_livraria.modelo;

import modulo03.ex03_livraria.abstracts.Produto;
import modulo03.ex03_livraria.utils.TipoProduto;

public class Brinquedo extends Produto {

    private String tipo;

    public Brinquedo(Long id, String nome, double preco, TipoProduto tipoProduto, String tipo) {
        super(id, nome, preco, tipoProduto);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
