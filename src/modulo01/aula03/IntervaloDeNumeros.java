package modulo01.aula03;
//programa que receba dois números inteiros e imprima os números inteiros que estão no intervalo compreendido entre eles.

import java.util.Scanner;

public class IntervaloDeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro número:");
        int num1 = sc.nextInt();
        System.out.println("Segundo número");
        int num2 = sc.nextInt();


        if (num1 < num2) {
            for (int i = num1 + 1; i < num2; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = num2 + 1; i < num1; i++) {
                System.out.println(i);
            }
        }
    }
}
