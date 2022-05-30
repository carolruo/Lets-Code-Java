package modulo03.ex02_cartas;

public interface Tabuleiro {

    void inserirDeck(Jogador jogador);
    boolean podeJogarCarta(Jogador jogador, Carta carta);
    void vencedor(Jogador jogador);
}
