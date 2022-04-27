package modulo01.aula03;

/*Faça um programa que leia um número inteiro diferente de zero e mostre uma mensagem indicando se este número
é positivo ou negativo. Pare a execução do programa quando o usuário requisitar
(O programa deve parar quando o usuário escolher 0).
 */

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (i != 0) {
            System.out.println("Digite um número para descobrir se é positivo ou negativo (Tecla 0 para fechar o programa):");
            int num = sc.nextInt();

            if (num == 0) {
                System.out.println("Encerrando o programa");
                i--;
            } else if (num < 0) {
                System.out.println("O número é negativo");
            } else {
                System.out.println("O número é positivo");
            }
        }

    }
}
