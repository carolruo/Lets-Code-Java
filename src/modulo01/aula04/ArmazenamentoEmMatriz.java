package modulo01.aula04;
//Escreva um código Java que leia 10 valores double do teclado e armazene-os em uma matriz de dimensões 2x5.

import java.util.Scanner;

public class ArmazenamentoEmMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] numeros = new double[2][5];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Digite um número para salvar na matriz:");
                numeros[i][j] = sc.nextDouble();
            }
        }
    }
}
