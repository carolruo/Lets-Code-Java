package modulo01.aula05;
/*Faça um programa que receba a idade e o peso de sete pessoas. Calcule e mostre:
A quantidade de pessoas com mais de 90 quilos;
A média das idades das sete pessoas;
*/

import java.util.Scanner;

public class MediaIdadeQuilos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pessoasNoventaKg = 0;
        int somaIdadesTotal = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println("Digite a sua idade:");
            int idade = sc.nextInt();
            somaIdadesTotal += idade;

            System.out.println("Digite seu peso(kg):");
            int peso = sc.nextInt();

            if (peso > 90) {
                pessoasNoventaKg++;
            }
        }
        System.out.printf("%d pessoas estão acima dos 90kg e a média de idades das sete pessoas é de %.2f anos.",
                            pessoasNoventaKg, (double) somaIdadesTotal / 7);
    }
}
