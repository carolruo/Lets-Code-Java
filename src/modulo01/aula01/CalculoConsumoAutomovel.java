package modulo01.aula01;
//Escreva um programa em java para definir o consumo médio de um automóvel sendo fornecido a distância
// total percorrida pelo automóvel e o total de combustível gasto (litros).

import java.util.Scanner;

public class CalculoConsumoAutomovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o total de combustível gasto em L:");
        double combustivelGasto = sc.nextDouble();

        System.out.println("Digite a distância total percorrida em Km:");
        double distanciaPercorrida = sc.nextDouble();

        double consumoMedio = distanciaPercorrida / combustivelGasto;

        System.out.printf("O consumo médio é de %.2f km/L", consumoMedio);
    }
}
