package modulo01.aula03;
/*
 *  Escreva um programa que receba 5 números inteiros, armazene-os em um array, e imprima na tela os valores em ordem decrescente.
 */

import java.util.Scanner;

public class ArrayDecrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número:");
            numeros[i] = sc.nextInt();
        }

        for (int i = 1; i < numeros.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numeros[i] > numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i] + " ");
        }
    }
}
