package modulo01.aula01;
//Escreva um programa que leia o nome de um aluno e as notas das 3 primeiras provas que ele obteve no semestre.
// No final deverá informar a média do aluno.
import java.util.Scanner;

public class CalculoMediaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do aluno:");
        String nome = sc.nextLine();

        double totalNotas = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite a nota do " + i + " bimestre");
            totalNotas += sc.nextDouble();
        }

        System.out.printf("A média do aluno(a) %s é de %.2f", nome, totalNotas/3);
    }
}
