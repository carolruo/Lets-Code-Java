package modulo01.aula04;
//Faça um programa para receber um conjunto de 10 valores até 100, e insira em uma matriz, em seguida você deverá
// receber um outro valor e verificar se o elemento existe no conjunto de 10 valores da matriz. Caso exista você
// deve imprimir uma mensagem: "O valor existe no conjunto", caso contrário deverá exibir: "--

import java.util.Scanner;

public class EncontrarNumeroDaLista {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[][] numeros = new int[2][5];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Digite um número até 100:");
                numeros[i][j] = sc.nextInt();
                if (numeros[i][j] > 100) {
                    throw new Exception("O valor deve ser menor que 100");
                }
            }
        }

        System.out.println("Agora entre com um número para saber se ele está contido na lista de número:");
        int numeroEscolhido = sc.nextInt();

        boolean achouNumero = false;

        for (int i = 0; i < numeros.length; i++) {
            if (achouNumero) break;
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] == numeroEscolhido) {
                    achouNumero = true;
                    System.out.println("O numero existe no conjunto");
                    break;
                }
            }
        }

        if (!achouNumero) {
            System.out.println("O numero não existe no conjunto");
        }
    }
}
