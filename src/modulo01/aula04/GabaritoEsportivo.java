package modulo01.aula04;
//Escreva um programa que leia um vetor de 13 elementos inteiros, que é o Gabarito de um teste da loteria esportiva,
// contendo os valores 1(coluna 1), 2 (coluna 2) e 3 (coluna 3). Leia, a seguir, para cada apostador,
// o número do seu cartão e um vetor de Respostas de 13 posições. Verifique para cada apostador o números de acertos,
// comparando o vetor de Gabarito com o vetor de Respostas. Escreva o número do apostador e o número de acertos.
// Se o apostador tiver 13 acertos, mostrar a mensagem "Ganhador".

import java.util.Random;
import java.util.Scanner;

public class GabaritoEsportivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] gabarito = new int[13];

        for (int i = 0; i < gabarito.length; i++) {
            gabarito[i] = new Random().nextInt(3) + 1;
            System.out.println(gabarito[i]);
        }
        int acertos = 0;

        for (int i = 0; i < gabarito.length; i++) {
            System.out.println("Entre com um número (1/2/3):");
            int resposta = sc.nextInt();
            if (gabarito[i] == resposta) {
                acertos++;
            }
        }

        if (acertos == 13) {
            System.out.println("Ganhador");
        } else {
            System.out.println("Pontuação: " + acertos);
        }
    }

}
