package modulo03.ex03_livraria;

public class Jogo extends Produto {

    private String distribuidora;
    private String genero;
    private String estudio;

    public Jogo(Long id, String nome, double preco, String distribuidora, String genero, String estudio) {
        super(id, nome, preco);
        this.distribuidora = distribuidora;
        this.genero = genero;
        this.estudio = estudio;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
