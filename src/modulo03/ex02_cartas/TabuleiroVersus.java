package modulo03.ex02_cartas;

import java.util.ArrayList;
import java.util.List;

public class TabuleiroVersus implements Tabuleiro {

    private List<Jogador> jogadores = new ArrayList<>(2);
    private List<CartaAtaque> cartasAtkJogador1 = new ArrayList<>(5);
    private List<CartaAtaque> cartasAtkEspecialJogador1 = new ArrayList<>(2);
    private List<CartaAtaque> cartasAtkJogador2 = new ArrayList<>(5);
    private List<CartaAtaque> cartasAtkEspecialJogador2 = new ArrayList<>(2);


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
