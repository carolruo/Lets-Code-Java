package modulo03.ex02_cartas;

import java.util.ArrayList;
import java.util.List;

public class TabuleiroParty implements Tabuleiro{

    private List<Jogador> jogadores = new ArrayList<>(5);
    private static List<Carta> deckJogador1 = new ArrayList<>(80);
    private static List<Carta> deckJogador2 = new ArrayList<>(80);
    private static List<Carta> deckJogador3 = new ArrayList<>(80);
    private static List<Carta> deckJogador4 = new ArrayList<>(80);
    private static List<Carta> deckJogador5 = new ArrayList<>(80);
    private List<Carta> campoTabuleiro = new ArrayList<>(34);

    @Override
    public void inserirDeck(Jogador jogador) {
        jogadores.add(jogador);
    }

    @Override
    public boolean podeJogarCarta(Jogador jogador, Carta carta) {
        if (jogador.getMp() < carta.getCusto()) {
            return false;
        }
        return true;
    }

    @Override
    public void vencedor(Jogador jogador) {
        verificaHp();
        if (jogadores.size() == 1) {
            System.out.println("Vencedor: " + jogador.getNome());
        }
    }

    public void verificaHp() {
        for (Jogador j : jogadores) {
            if (j.getHp() <= 0) {
                jogadores.remove(j);
            }
        }
    }
}
