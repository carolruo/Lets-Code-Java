package modulo01.aula03;
/*
 * Escreva um programa que conte de 1 até 100 e a cada múltiplo de 10 exiba uma mensagem: “Múltiplo de 10”.
 */

import java.util.Scanner;

public class MultiplosDeDez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(i + " (Multiplo de 10)");
            } else {
                System.out.println(i);
            }
        }
    }
}
