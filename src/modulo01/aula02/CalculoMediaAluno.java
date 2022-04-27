package modulo01.aula02;
//Escreva um programa que seja capaz de receber as seguintes informações e calcular a média da nota de um aluno:
//Nome Turma Nota 1 Nota 2 Nota 3

import java.util.Scanner;

public class CalculoMediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = sc.nextLine();
        System.out.println("Digite a turma:");
        double turma = sc.nextDouble();
        System.out.println("Digite a primeira nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota:");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("O aluno(a) %s da turma %s tem a média de %.2f", nome, turma, media);

    }
}
