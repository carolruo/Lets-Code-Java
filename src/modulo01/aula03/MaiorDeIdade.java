package modulo01.aula03;
/*Escreva um programa que exiba quantas pessoas possuem mais de 18 anos.
O algoritmo deverá ler a idade de 10 pessoas.
 */

import java.util.Scanner;

public class MaiorDeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] idades = new int[10];
        int maioresDeDezoito = 0;

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Digite a idade da pessoa:");
            idades[i] = sc.nextInt();

            if (idades[i] >= 18) {
                maioresDeDezoito++;
            }
        }
        System.out.printf("%d pessoas são maiores de 18 anos.", maioresDeDezoito);
    }
}
