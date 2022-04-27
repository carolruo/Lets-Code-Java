package modulo01.aula05;
/*Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
“Telefonou para a vítima? “
“Esteve no local do crime?”
“Mora perto da vítima? “
“Devia para a vítima? “
“Já trabalhou com a vítima? “
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”, entre 3 e 4 como
“Cúmplice” e 5 como “Assassino”. Caso contrário, ela será classificada como “Inocente”.
*/

import java.util.Scanner;

public class AutomatizadorDeInvestigacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char respostas[] = new char[5];
        int contador = 0;

        System.out.println("Telefonou para a vítima?(y/n)");
        respostas[0] = sc.nextLine().charAt(0);
        System.out.println("Esteve no local do crime?(y/n)");
        respostas[1] = sc.nextLine().charAt(0);
        System.out.println("Mora perto da vítima?(y/n)");
        respostas[2] = sc.nextLine().charAt(0);
        System.out.println("Devia para a vítima?(y/n)");
        respostas[3] = sc.nextLine().charAt(0);
        System.out.println("Já trabalhou com a vítima?(y/n)");
        respostas[4] = sc.nextLine().charAt(0);

        for (int i = 0; i < 5; i++) {
            if (respostas[i] == 'y') {
                contador++;
            }
        }

        if (contador == 5) {
            System.out.println("Assassino");
        } else if (contador == 3 || contador == 4) {
            System.out.println("Cúmplice");
        } else if (contador == 2) {
            System.out.println("Suspeita");
        } else {
            System.out.println("Inocente");
        }
    }
}
