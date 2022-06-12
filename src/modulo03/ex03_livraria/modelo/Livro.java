package modulo03.ex03_livraria.modelo;

import modulo03.ex03_livraria.abstracts.Produto;
import modulo03.ex03_livraria.utils.TipoProduto;

import java.util.List;

public class Livro extends Produto {

    private List<String> generos;
    private String escritor;
    private String editora;

    public Livro(Long id, String nome, double preco, TipoProduto tipoProduto, List<String> generos, String escritor, String editora) {
        super(id, nome, preco, tipoProduto);
        this.generos = generos;
        this.escritor = escritor;
        this.editora = editora;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{"  +
                "id=" + super.getId() +
                ", nome='" + super.getNome() + '\'' +
                ", preco=" + super.getPreco() +
                "generos=" + generos +
                ", escritor='" + escritor + '\'' +
                ", editora='" + editora + '\'' +
                '}';
    }
}