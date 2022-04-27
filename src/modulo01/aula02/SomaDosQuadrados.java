package modulo01.aula02;
// Leia 4 (quatro) números calcule o quadrado para cada um (n²) some todos e exiba o resultado

import java.util.Scanner;

public class SomaDosQuadrados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite um número:");
            double numero = sc.nextDouble();
            soma += numero * numero;
        }
        System.out.printf("A soma dos quadrados dos números é %.2f", soma);
    }
}
