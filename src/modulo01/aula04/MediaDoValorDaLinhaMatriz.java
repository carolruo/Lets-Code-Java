package modulo01.aula04;
//Crie um método que recebe uma matriz bidimensional inteira e um inteiro que indica uma de suas linhas, e retorna a média dos valores daquela linha
import java.util.Scanner;

public class MediaDoValorDaLinhaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas linhas a matriz deve possuir?");
        int linhas = sc.nextInt();

        System.out.println("Quantas colunas a matriz deve possuir?");
        int colunas = sc.nextInt();

        System.out.println("Indique a linha da matriz que deverá retornar sua média:");
        int linhaMedia = (sc.nextInt() - 1);

        int[][] numeros = new int[linhas][colunas];
        double soma = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Digite o número para entrar na matriz:");
                numeros[i][j] = sc.nextInt();
                if (i == linhaMedia) {
                    soma += numeros[i][j];
                }
            }
        }
        System.out.printf("A média da linha escolhida é %.2f", (soma/colunas));
    }
}
