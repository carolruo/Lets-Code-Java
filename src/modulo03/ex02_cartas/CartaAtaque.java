package modulo03.ex02_cartas;

public class CartaAtaque implements Carta {

    private String nome;
    private String tipo;
    private int custo;
    private int poder;
    private int resistencia;

    public CartaAtaque(String nome, String tipo, int custo, int poder, int resistencia) {
        this.nome = nome;
        this.tipo = tipo;
        this.custo = custo;
        this.poder = poder;
        this.resistencia = resistencia;
    }

    public int getPoder() {
        return poder;
    }

    public int getResistencia() {
        return resistencia;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public int getCusto() {
        return custo;
    }
}
