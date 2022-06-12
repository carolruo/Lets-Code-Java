package modulo03.ex03_livraria;

import java.util.List;

public interface ICaixa {

    void compra(Long id, Cliente cliente);

    void compraTotal(List<Produto> listaCompra);
    boolean verificaCliente(Cliente cliente);
}
