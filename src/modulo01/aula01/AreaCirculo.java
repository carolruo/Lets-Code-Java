package modulo01.aula01;
//14. Escreva um programa para ler o raio de um círculo, calcular e escrever o valor da área:
//Cálculo:  área = PI * (raio²)

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do círculo:");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A área do círculo é de %.2f unidades", area);
    }
}
