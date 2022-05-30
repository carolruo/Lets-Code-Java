package modulo03.ex02_cartas;

import java.util.ArrayList;

public class Jogador {

    private String nome;
    private int hp = 20;
    private int mp = 20;
    private ArrayList<Carta> deck;

    public Jogador(String nome, ArrayList<Carta> deck) {
        this.nome = nome;
        this.deck = deck;
    }

    public String getNome() {
        return nome;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }
}
