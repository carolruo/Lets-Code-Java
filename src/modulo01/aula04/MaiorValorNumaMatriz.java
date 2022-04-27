package modulo01.aula04;
// Crie um método que recebe uma matriz bidimensional double e retorna o maior valor da matriz.
import java.util.Scanner;

public class MaiorValorNumaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas linhas a matriz deve possuir?");
        int linhas = sc.nextInt();

        System.out.println("Quantas colunas a matriz deve possuir?");
        int colunas = sc.nextInt();

        double[][] numeros = new double[linhas][colunas];
        double maiorNumero = Double.MIN_VALUE;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Digite um número para salvar na matriz:");
                numeros[i][j] = sc.nextDouble();
                if (numeros[i][j] > maiorNumero) {
                    maiorNumero = numeros[i][j];
                }
            }
        }
        System.out.println("O maior valor da matriz é " + maiorNumero);
    }
}
