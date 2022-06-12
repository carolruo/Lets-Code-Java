package modulo03.ex03_livraria.interfaces;

import modulo03.ex03_livraria.abstracts.Produto;
import modulo03.ex03_livraria.modelo.Cliente;

import java.util.List;

public interface ICaixa {

    double compraValorTotal(List<Produto> produtos, Cliente cliente);

}
