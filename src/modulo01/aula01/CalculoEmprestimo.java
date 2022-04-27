package modulo01.aula01;

import java.util.Scanner;

public class CalculoEmprestimo {
    public static void main(String[] args) {

        final double TAXA_DE_JUROS = 0.02;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantia que quer emprestar:");
        double valorEmprestimo = sc.nextDouble();

        System.out.println("Digite em quantos meses irá pagar:");
        int meses = sc.nextInt();

        double montante = valorEmprestimo * Math.pow((1 + TAXA_DE_JUROS), meses);

        System.out.printf("Após a aplicação dos juros, você irá pagar %.2f", montante);
    }
}
