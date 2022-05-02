package modulo01.aula06;
/*Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu
peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7
*/

import java.util.Scanner;

public class CalculoPesoPessoa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu sexo(f/m):");
        char sexo = sc.nextLine().charAt(0);
        System.out.println("Para saber seu peso ideal, digite a sua altura em metros:");
        double h = sc.nextDouble();

        double pesoIdeal;
        if (sexo == 'f') {
            pesoIdeal = (62.1 * h) - 44.7;
        } else if (sexo == 'm') {
            pesoIdeal = (72.7 * h) - 58;
        } else {
            throw new Exception("Você digitou o sexo inválido.");
        }

        System.out.printf("Seu peso ideal é %.2fkg", pesoIdeal);
    }
}
