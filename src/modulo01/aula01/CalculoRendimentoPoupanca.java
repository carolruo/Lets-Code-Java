package modulo01.aula01;
//Crie um programa que receba um valor que foi depositado e logo em seguida o valor com rendimento após 1 mês.
// Considere a taxa de juros da poupança em 0,70% a.m.
import java.util.Scanner;

public class CalculoRendimentoPoupanca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do depósito:");
        double valorDeposito = sc.nextDouble();

        double valorComRendimentoPrimeiroMes = valorDeposito + valorDeposito*0.007;

        System.out.printf("O valor da poupança após um mês será de %.2f", valorComRendimentoPrimeiroMes);
    }
}
