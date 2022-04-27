package modulo01.aula04;
//Crie um método que recebe uma matriz de inteiros e retorna a soma de todos os elementos da matriz.
import java.util.Scanner;

public class SomarMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas linhas a matriz deve possuir?");
        int linhas = sc.nextInt();

        System.out.println("Quantas colunas a matriz deve possuir?");
        int colunas = sc.nextInt();

        int[][] numeros = new int[linhas][colunas];
        int soma = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Digite o número para entrar na matriz:");
                numeros[i][j] = sc.nextInt();
                soma += numeros[i][j];
            }
        }
        System.out.println("A soma da matriz é: " + soma);
    }
}
