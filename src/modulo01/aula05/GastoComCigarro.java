package modulo01.aula05;
/*Calcular a quantidade de dinheiro gasta por um fumante.
Dados: o número de anos que ele fuma, o nº de cigarros fumados por dia e o preço de uma carteira com 20 cigarros.
* */

import java.util.Scanner;

public class GastoComCigarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fuma há quantos anos?");
        int anos = sc.nextInt();
        System.out.println("Nº de cigarros fumados por dia:");
        int cigarrosPorDia = sc.nextInt();
        System.out.println("Preço de uma carteira com 20 cigarros:");
        double precoCarteira = sc.nextDouble();

        double totalGasto = (double) anos * 365 * cigarrosPorDia / 20 * precoCarteira;

        System.out.printf("Você já gastou aproximadamente R$%.2f em cigarros", totalGasto);
    }
}
