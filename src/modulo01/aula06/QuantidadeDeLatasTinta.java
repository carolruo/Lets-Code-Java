package modulo01.aula06;
/*Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros,
que custam R$ 80,00. Informe ao usuário a quantidade de latas de tinta a serem compradas e o preço total.*/

import java.util.Scanner;

public class QuantidadeDeLatasTinta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o tamanho em metros quadrados da área a seer pintada:");
        double area = sc.nextDouble();

        double litrosNecessarios = area / 3;
        double latasNecessarias = litrosNecessarios / 18;
        int latasInteiras = (int) Math.ceil(latasNecessarias);
        double precoTotal = latasInteiras * 80;

        System.out.printf("Latas necessárias: " + latasInteiras + "\nPreço total de R$%.2f", precoTotal);
    }
}
