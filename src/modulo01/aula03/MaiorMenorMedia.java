package modulo01.aula03;
/*Escreva um programa que leia 10 valores inteiros e positivos e encontre o maior valor,
o menor valor e calcule a média dos números lidos e exiba essas informações.
 */

import java.util.Scanner;

public class MaiorMenorMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int maiorValor = 0;
        int menorValor = Integer.MAX_VALUE;
        double total = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número inteiro e positivo:");
            numeros[i] = sc.nextInt();

            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
            }
            if (numeros[i] < menorValor) {
                menorValor = numeros[i];
            }

            total += numeros[i];
        }

        System.out.printf("O maior número digitado é %d, o menor número é %d e a média total é %.2f",
                maiorValor, menorValor, (total / 10));
    }
}
