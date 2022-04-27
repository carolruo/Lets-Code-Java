package modulo01.aula03;
/*Escreva um programa que receba o peso e a altura de uma pessoa e calcule o seu IMC, o resultado irá dizer se a pessoa
está: abaixo do peso (IMC inferior a 18,5), com peso normal (IMC entre 18,5 a 24,9), com excesso de peso
(IMC entre 25,0 a 29,9) ou obesa (30 ou mais de IMC), informe cada um deles com uma mensagem.
 */

import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua massa(kg):");
        double massa = sc.nextDouble();
        System.out.println("Digite sua altura(m):");
        double altura = sc.nextDouble();

        double imc = massa / (altura * altura);

        if (imc >= 30) {
            System.out.println("De acordo com seu IMC você está obeso");
        } else if (imc >= 25) {
            System.out.println("De acordo com seu IMC você está com excesso de peso");
        } else if (imc >= 18.5) {
            System.out.println("De acordo com seu IMC você está com peso normal");
        } else {
            System.out.println("De acordo com seu IMC você está abaixo do peso");
        }

    }
}
