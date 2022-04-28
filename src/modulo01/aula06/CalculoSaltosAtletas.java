package modulo01.aula06;
/*Em uma competição de salto em distância cada atleta tem direito a cinco saltos. No final da série de saltos
de cada atleta, o melhor e o pior resultados são eliminados. O seu resultado fica sendo a média dos três
valores restantes. Você deve fazer um programa que receba o nome e as cinco distâncias alcançadas pelo atleta
em seus saltos e depois informe a média dos saltos conforme a descrição acima informada (retirar o melhor e o
pior salto e depois calcular a média). Faça uso de uma lista para armazenar os saltos.
Os saltos são informados na ordem da execução, portanto não são ordenados.

O programa deve ser encerrado quando não for informado o nome do atleta.
A saída do programa deve ser conforme o exemplo abaixo:

Atleta: João da Silva

Primeiro Salto: 6.5 m
Segundo Salto: 6.1 m
Terceiro Salto: 6.2 m
Quarto Salto: 5.4 m
Quinto Salto: 5.3 m

Melhor salto: 6.5 m
Pior salto: 5.3 m

Média dos demais saltos: 5.9 m

Resultado final:
Rodrigo Curvêllo: 5.9 m
*/

import java.util.Scanner;

public class CalculoSaltosAtletas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double maiorSalto = Double.MIN_VALUE;
        double menorSalto = Double.MAX_VALUE;
        double[] saltosTotais = new double[5];
        double somaSaltos = 0;

        System.out.println("Nome do atleta:");
        String atleta = sc.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.println("Distância alcançada no salto(m):");
            saltosTotais[i] = sc.nextDouble();
            somaSaltos += saltosTotais[i];
            if (saltosTotais[i] > maiorSalto) {
                maiorSalto = saltosTotais[i];
            } else if (saltosTotais[i] < menorSalto) {
                menorSalto = saltosTotais[i];
            }
        }

        System.out.println("\nAtleta: " + atleta);
        System.out.println();
        System.out.println("Primeiro Salto: " + saltosTotais[0] + "\nSegundo Salto: " + saltosTotais[1]
                + "\nTerceiro Salto: " + saltosTotais[2] + "\nQuarto Salto: " + saltosTotais[3]
                + "\nQuinto Salto: " + saltosTotais[4]);
        System.out.println();
        System.out.println("Melhor salto: " + maiorSalto + "\nPior salto: " + menorSalto);
        System.out.println();
        System.out.printf("Média dos demais saltos: %.2f", (somaSaltos - maiorSalto - menorSalto)/3);
    }
}
