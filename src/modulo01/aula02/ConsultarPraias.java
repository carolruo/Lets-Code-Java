package modulo01.aula02;
/*
* Um hotel quer fazer um levantamento das praias da cidade para uma
programação turística. Sabendo-se que cada praia tem um nome e uma
distância (em Km) do hotel, escreva um programa que forneça os
seguintes dados:
- O nome da praia mais distante.
- Quantas praias estão a mais de 10km e a menos de 15km.
- A distância média das praias.
Para cada praia deverá ser informado seu nome e a distância em Km
do hotel.
Você deve receber 5 praias;
Você deve armazenar o nome das 5 praias em um array;
*/

import java.util.Scanner;

public class ConsultarPraias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] praias = new String[5];
        String praiaMaisDistante = "";
        double distanciaMedia = 0;
        double distanciaPraia = 0;
        double distanciaPraiaComparator = 0;
        int contadorKm = 0;

        for (int i = 0; i < praias.length; i++) {
            System.out.println("Nome da praia:");
            praias[i] = sc.nextLine();
            System.out.println("Distância da praia em km:");
            distanciaPraia = sc.nextDouble();
            sc.nextLine();

            if (distanciaPraia > distanciaPraiaComparator) {
                distanciaPraiaComparator = distanciaPraia;
                praiaMaisDistante = praias[i];
            }
            if (distanciaPraia > 10 && distanciaPraia < 15) {
                contadorKm++;
            }
            distanciaMedia += distanciaPraia;
        }

        System.out.printf("A praia mais distante do hotel é %s.\n", praiaMaisDistante);
        System.out.printf("%d praias estão entre 10km e 15km do hotel.\n", contadorKm);
        System.out.printf("%.2f é a distância média das praias pro hotel.", distanciaMedia / 5);
    }
}
