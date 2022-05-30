package modulo03.ex02_cartas;

public class CartaAtaqueEspecial extends CartaAtaque {

    private String efeito;

    public CartaAtaqueEspecial(String nome, String tipo, int custo, int poder, int resistencia, String efeito) {
        super(nome, tipo, custo, poder, resistencia);
        this.efeito = efeito;
    }

    public String getEfeito() {
        return efeito;
    }
}
