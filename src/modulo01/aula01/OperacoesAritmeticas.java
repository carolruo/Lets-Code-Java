package modulo01.aula01;
//Crie um programa que receba 2 números e ao final mostre as seguintes operações:
//Soma, Subtração, Multiplicação, Divisão

import java.util.Scanner;

public class OperacoesAritmeticas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = sc.nextInt();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;

        String resultado = "Soma: " + soma + ", Subtração: " + subtracao
                + ", Multiplicação: " + multiplicacao + ", ";

        if (numero2 == 0) {
            resultado += "Erro: divisão por zero.";
            System.out.println(resultado);
        } else {
            double divisao = (double) numero1 / numero2;
            System.out.printf(resultado + "Divisão: %.2f", divisao);
        }
    }
}
