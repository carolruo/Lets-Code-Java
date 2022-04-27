package modulo01.aula03;
/*Escreva um programa que leia quatro notas escolares de um aluno e apresenta uma mensagem informando
se o aluno foi aprovado caso apresente o valor da média escolar maior ou igual a 7. Caso contrário,
apresente uma mensagem informando que ele está de recuperação.*/

import java.util.Scanner;

public class CalculoAprovacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notaTotal = 0;

        for (int i = 1; i < 5; i++) {
            System.out.println("Digite a note do " + i + " bimestre:");
            double nota = sc.nextDouble();
            notaTotal += nota;
        }

        notaTotal = notaTotal / 4;

        if (notaTotal < 7) {
            System.out.println("Você foi reprovado.");
        } else {
            System.out.println("Você foi aprovado.");
        }
    }
}
