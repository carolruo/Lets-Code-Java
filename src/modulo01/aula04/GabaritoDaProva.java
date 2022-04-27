package modulo01.aula04;
//Escreva um código que leia um vetor G de 10 elementos do tipo caracter que representa o gabarito de uma prova.
// A seguir, para cada um dos 10 alunos da turma, leia o vetor de respostas (R) do aluno e conte o número de acertos.
// Mostre o número de acertos do aluno e uma mensagem APROVADO, se a nota for maior ou igual a 6;
// e mostre uma mensagem de REPROVADO, caso contrário.

import java.util.Scanner;

public class GabaritoDaProva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] gabarito = new char[5];

        for (int i = 0; i < gabarito.length; i++) {
            System.out.println("Entre com o gabarito da prova:");
            gabarito[i] = sc.nextLine().charAt(0);
        }

        int acertos = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < gabarito.length; j++) {
                System.out.println("Entre com sua resposta:");
                char resposta = sc.nextLine().charAt(0);
                int compare = Character.compare(gabarito[j], resposta);
                if (compare == 0) {
                    acertos++;
                }
            }
            if (acertos >= 3) {
                System.out.println("APROVADO");
            } else {
                System.out.println("REPROVADO");
            }
        }


    }
}
