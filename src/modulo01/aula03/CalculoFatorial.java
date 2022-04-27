package modulo01.aula03;
/*Escreva um programa que recebe um número inteiro maior que zero e calcula o seu valor fatorial.
Exemplo: Entrada usuário: 6, saída do programa: 720
Explicação: 6 x 5 x 4 x 3 x 2 x 1 = 720*/

import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para saber seu fatorial:");
        int num = 6;

        for (int i = num - 1; i > 1; i--) {
            num = num * i;
        }
        System.out.println("Fatorial: " + num);

//        int temp = num;
//        while (num > 1) {
//            temp = temp*(num -1);
//            num--;
//        }
//        System.out.println(temp);
    }
}
