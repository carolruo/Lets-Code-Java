package modulo01.aula04;
//Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades dos homens
// serão sempre diferentes entre si, bem como as das mulheres).
//Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades
// do homem mais novo com a mulher mais velha.

import java.util.Scanner;

public class ComparadorDeIdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        int homemMaisVelho = Integer.MIN_VALUE;
        int homemMaisNovo = Integer.MAX_VALUE;
        int mulherMaisVelha = Integer.MIN_VALUE;
        int mulherMaisNova = Integer.MAX_VALUE;

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite a idade de um homem:");
            idade = sc.nextInt();
            if (homemMaisNovo > idade) {
                homemMaisNovo = idade;
            }
            if (homemMaisVelho < idade) {
                homemMaisVelho = idade;
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite a idade de uma mulher:");
            idade = sc.nextInt();
            if (mulherMaisNova > idade) {
                mulherMaisNova = idade;
            }
            if (mulherMaisVelha < idade) {
                mulherMaisVelha = idade;
            }
        }

        System.out.printf("Soma das idades do homem mais velho com a mulher mais nova: %d",
                homemMaisVelho + mulherMaisNova);
        System.out.printf("Produto das idades do homem mais novo com a mulher mais velha: %d",
                homemMaisNovo * mulherMaisVelha);
    }
}
