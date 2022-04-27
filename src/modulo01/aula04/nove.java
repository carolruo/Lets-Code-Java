package modulo01.aula04;
//Crie um programa que preencha uma matriz de 3x5 com números inteiros. Em seguida faça:
//some cada uma das linhas armazenando o resultado em um vetor;
//some cada uma das colunas armazenando o resultado em um vetor;
//imprima o resultado da soma das linhas;
//imprima o resultado da soma das coluna;
//imprima a matriz completa

import java.util.Random;
import java.util.Scanner;

public class nove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[3][5];
        int somaLinhas[] = new int[3];
        int somaColunas[] = new int[5];
        int somaL, somaC;

        //criaçao matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = new Random().nextInt(10);
                System.out.printf("%d ",matriz[i][j]);
            }
            System.out.println("");
        }

        //soma linhas
        for (int i = 0; i < matriz.length; i++) {
            somaL = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaL += matriz[i][j];
            }
            somaLinhas[i] = somaL;
        }

        //soma colunas
        for (int i = 0; i < 3; i++) {
            somaC = 0;
            for (int j = 0; j < matriz.length; j++) {
                somaC += matriz[j][i];
            }
            somaColunas[i] = somaC;
        }

        for (int i = 0; i < somaLinhas.length; i++) {
            System.out.printf("\nSoma da linha %d é %d", i , somaLinhas[i]);
        }

        System.out.println("");

        for (int i = 0; i < somaColunas.length; i++) {
            System.out.printf("\nSoma da coluna %d é %d", i , somaColunas[i]);
        }
    }
}
