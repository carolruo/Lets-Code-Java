package modulo01.aula02;
/*
Escreva um programa para calcular a quantidade de litros de combustível necessária para se fazer uma viagem,
sabendo-se que o carro faz 12 Km com um litro. Deverão ser fornecidos o tempo gasto na viagem e a velocidade média.
utilizar as seguintes fórmulas:
distância = tempo x velocidade
litros usados = distância / 12
*/

import java.util.Scanner;

public class CalculoCombustivelParaViagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tempo gasto na viagem:");
        double tempoViagem = sc.nextDouble();
        System.out.println("Digite a velocidade média durante a viagem:");
        double velocidadeMedia = sc.nextDouble();

        double distanciaViagem = tempoViagem * velocidadeMedia;
        double litrosUsados = distanciaViagem / 12;

        System.out.printf("A quantidade de combustível necessária para a viagem é de %.2fL", litrosUsados);
    }

}
