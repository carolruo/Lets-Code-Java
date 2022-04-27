package modulo01.aula01;
//13. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos.
// Supondo que a porcentagem do distribuidor seja de 28% e os impostos de 45%. Escreva um programa que leia o custo de
// fábrica e informe o custo ao consumidor final

import java.util.Scanner;

public class CarroCustoConsumidorFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o custo de fábrica desse carro?");
        double custoDeFabrica = sc.nextDouble();

        double custoFinal = custoDeFabrica + custoDeFabrica * 0.28 + custoDeFabrica * 0.45;

        System.out.printf("O custo desse carro para o consumidor final é de %.2f", custoFinal);
    }
}
