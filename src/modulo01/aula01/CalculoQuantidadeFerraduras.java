package modulo01.aula01;
//Escreva um programa para calcular a quantidade de ferraduras necessárias para equipar todos os cavalos comprados para
// um haras. A informação de cavalos comprados deve ser informada pelo usuário.
import java.util.Scanner;

public class CalculoQuantidadeFerraduras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de cavalos no haras: ");
        int quantidadeCavalos = sc.nextInt();

        int totalFerraduras = quantidadeCavalos * 4;

        System.out.printf("%d ferraduras devem ser compradas", totalFerraduras);
    }
}
