package modulo01.aula05;
/*Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
	1. Média aritmética
	2. Média ponderada
Digite a opção desejada:
	Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
	Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
Verifique a possibilidade de opção inválida, mostrando uma mensagem.
*/

import java.util.Scanner;

public class MediaAritmeticaPonderada {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção:\n" + "\t1. Média aritmética\n" + "\t2. Média ponderada");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("Digite a primeira nota:");
            double primeiraNota = sc.nextDouble();
            System.out.println("Digite a segunda nota:");
            double segundaNota = sc.nextDouble();

            System.out.println("A média aritmética das duas notas é " + (primeiraNota + segundaNota) / 2);

        } else if (opcao == 2) {
            double somaPesos = 0;
            double somaNotas = 0;

            int i = 0;
            while (i < 3) {
                System.out.println("Digite a nota:");
                double nota = sc.nextDouble();
                System.out.println("Digite o peso da nota:");
                double peso = sc.nextDouble();

                somaPesos += peso;
                somaNotas += nota * peso;
                i++;
            }
            System.out.println("A média ponderada das três notas é " + somaNotas / somaPesos);

        } else {
            throw new Exception("Opção inválida");
        }
    }
}
