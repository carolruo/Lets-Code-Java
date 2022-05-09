package modulo02.exercicio_jogadores;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TimeZone;

public class TesteJogador {
    public static void main(String[] args) {

        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
        ArrayList<Jogador> time = new ArrayList<>();

        Jogador jogador1 = new Jogador(0, "José", "Chusezin", LocalDate.of(1994,02,02), 1, "Zagueiro", 100, 0, 0, false);
        Jogador jogador2 = new Jogador(1, "João", "Chuaozin", LocalDate.of(1994,02,02), 2, "Goleiro", 100, 0, 0, false);
        Jogador jogador3 = new Jogador(2, "Joca", "Joquinha", LocalDate.of(1994,02,02), 3, "Centromedio", 100, 0, 0, false);
        Jogador jogador4 = new Jogador(3, "Vitória", "Fitorinha", LocalDate.of(1994,02,02), 4, "Mediovolante", 100, 0, 0, false);
        Jogador jogador5 = new Jogador(4, "Floco", "Flocuuu", LocalDate.of(1994,02,02), 5, "Centroavante", 100, 0, 0, false);
        Jogador jogador6 = new Jogador(5, "Banguela", "Peti", LocalDate.of(1994,02,02), 6, "Atacante", 100, 0, 0, false);
        Jogador jogador7 = new Jogador(6, "Kipa", "Kipona", LocalDate.of(1994,02,02), 7, "Lateral-direito", 100, 0, 0, false);
        Jogador jogador8 = new Jogador(7, "Marla", "Mala", LocalDate.of(1994,02,02), 8, "Lateral-esquerdo", 100, 0, 0, false);
        Jogador jogador9 = new Jogador(8, "Nina", "Ninoka", LocalDate.of(1994,02,02), 9, "Alas", 100, 0, 0, false);
        Jogador jogador10 = new Jogador(9, "Ink", "Inquilino", LocalDate.of(1994,02,02), 10, "Líbero", 100, 0, 0, false);
        Jogador jogador11 = new Jogador(10, "Alecrim", "Marelin", LocalDate.of(1994,02,02), 11, "Meia de contenção", 100, 0, 0, false);

        time.add(jogador1);
        time.add(jogador2);
        time.add(jogador3);
        time.add(jogador4);
        time.add(jogador5);
        time.add(jogador6);
        time.add(jogador7);
        time.add(jogador8);
        time.add(jogador9);
        time.add(jogador10);
        time.add(jogador11);

        jogador1.aplicarCartaoAmarelo(3);
        jogador1.aplicarCartaoVermelho();
        jogador1.cumprirSuspensao();
        jogador1.sofrerLesao();

        jogador1.executarTreinamento();



        for (Jogador jogador : time) {
            System.out.println(jogador);
        }

    }
}
