package modulo02.exercicio_jogadores;

import java.time.LocalDate;
import java.util.Random;

public class Jogador {
    private int id;
    private String nome;
    private String apelido;
    private LocalDate dataNascimento;
    private int numero;
    private String posicao;
    private int qualidade;
    private int cartoesAmarelo;
    private int cartaoVermelho;
    private Boolean suspenso;
    private Boolean treinou;

    public Jogador() {

    }

    public Jogador(int id, String nome, String apelido, LocalDate dataNascimento, int numero, String posicao, int qualidade, int cartoesAmarelo, int cartaoVermelho, Boolean suspenso) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoesAmarelo = cartoesAmarelo;
        this.cartaoVermelho = cartaoVermelho;
        this.suspenso = suspenso;
    }

    public Boolean isApto() {
        if (cartoesAmarelo > 2 || cartaoVermelho > 0) {
            suspenso = true;
            return false;
        }
        return true;
    }

    public void aplicarCartaoAmarelo(int cartao) {
        this.cartoesAmarelo += cartao;
        isApto();
    }

    public void aplicarCartaoVermelho() {
        this.cartaoVermelho++;
        isApto();
    }

    public void cumprirSuspensao() {
        this.cartaoVermelho = 0;
        this.cartoesAmarelo = 0;
    }

    public void sofrerLesao() {
        Random random = new Random();
        int lesao = random.nextInt(101);

        if (lesao < 5) {
            qualidade -= qualidade * 0.15;
        } else if (lesao < 15) {
            qualidade -= qualidade * 0.1;
        } else if (lesao < 30) {
            qualidade -= qualidade * 0.05;
        } else if (lesao < 60) {
            qualidade -= 2;
        } else {
            qualidade--;
        }

        if (qualidade < 0) {
            suspenso = true;
        }
    }

    public void executarTreinamento() {
        if (!treinou) {
            Random random = new Random();
            int aumento = random.nextInt(3);
            qualidade += (aumento + 1);
        }
    }

    @Override
    public String toString() {
        String apto;
        if (isApto()) {
            apto = "PODE JOGAR";
        } else {
            apto = "SUSPENSO";
        }
        return posicao + ": " + numero + " - " + nome + " (" + apelido + ") - " + dataNascimento + " CONDIÇÃO: " + apto;
    }
}
