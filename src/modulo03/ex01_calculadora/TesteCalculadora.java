package modulo03.ex01_calculadora;

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("~~~~~~Calculadora~~~~~~");

        double n1 = 0, n2 = 0;
        boolean controle = true;
        double resultado = 0;

        while (controle) {

            System.out.println("\n\tEscolha o que deseja fazer:\n" +
                    "\t(1) Soma\n" + "\t(2) Subtração\n" + "\t(3) Multiplicação\n" + "\t(4) Divisão\n" + "\t(5) Sair");
            int opcaoEscolhida = sc.nextInt();
            sc.nextLine();

            if (opcaoEscolhida != 5) {
                System.out.println("Digite o primeiro número");
                n1 = sc.nextDouble();
                sc.nextLine();

                System.out.println("Digite o segundo número");
                n2 = sc.nextDouble();
                sc.nextLine();
            }

            switch (opcaoEscolhida) {
                case 1:
                    Soma soma = new Soma();
                    resultado = soma.calculo(n1, n2);
                    System.out.printf("%.2f + %.2f = %.2f\n", n1, n2, resultado);
                    break;

                case 2:
                    Subtracao sub = new Subtracao();
                    resultado = sub.calculo(n1, n2);
                    System.out.printf("%.2f - %.2f = %.2f\n", n1, n2, resultado);
                    break;

                case 3:
                    Multiplicacao mult = new Multiplicacao();
                    resultado = mult.calculo(n1, n2);
                    System.out.printf("%.2f * %.2f = %.2f\n", n1, n2, resultado);
                    break;

                case 4:
                    Divisao div = new Divisao();
                    resultado = div.calculo(n1, n2);
                    System.out.printf("%.2f / %.2f = %.2f\n", n1, n2, resultado);
                    break;

                case 5:
                    controle = false;
                    System.out.println("Desligando");
            }
        }
    }
}
