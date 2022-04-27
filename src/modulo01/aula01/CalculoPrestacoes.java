package modulo01.aula01;
//Uma loja está vendendo seus produtos em 5 prestações sem juros. Faça um programa que insira o valor total
// de uma compra e o valor das prestações.
import java.util.Scanner;

public class CalculoPrestacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor dp produto:");
        double valorProduto = sc.nextDouble();

        double valorPrestacoes = valorProduto / 5;

        System.out.printf("O valor das prestacoes em 5x desse produto será de %.2f", valorPrestacoes);
    }
}
