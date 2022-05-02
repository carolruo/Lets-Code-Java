package modulo01.aula06;
/*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de
São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa
que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do
limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
 */

import java.util.Scanner;

public class CalculoMultaPeixe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o peso total da pescaria:");
        double pesoTotal = sc.nextDouble();

        if (pesoTotal > 50) {
            double excessoPeso = pesoTotal - 50;
            double valorMulta = excessoPeso * 4;
            System.out.printf("O excesso de peso foi de %.2fkg e o valor da multa a ser paga é de R$%.2f.",
                    excessoPeso, valorMulta);
        } else {
            System.out.println("O peso está dentro do limite.");
        }
    }
}
