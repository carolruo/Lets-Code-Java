package modulo01.aula03;
/*Escreva um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150
Salário: maior que 0
Sexo: ‘f’ ou ‘m’
Estado civil: ‘s’, ‘c’, ‘v’, ‘d’
*/

import java.util.Scanner;

public class Verificador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome:");
        String nome = sc.nextLine();
        if (nome.length() <= 3) {
            throw new Exception("O nome precisa ser maior que 3 caracteres!");
        }

        System.out.println("Idade:");
        int idade = sc.nextInt();
        if (idade < 0 || idade > 150) {
            throw new Exception("Idade inválida");
        }

        System.out.println("Salário:");
        double salario = sc.nextDouble();
        if (salario < 0) {
            throw new Exception("O salário não pode ser menor que zero.");
        }

        System.out.println("Sexo(f/m):");
        char sexo = sc.next().charAt(0);
        int compareF = Character.compare(sexo, 'f');
        int compareM = Character.compare(sexo, 'm');
        if (compareF != 0 && compareM != 0) {
            throw new Exception("Sexo inválido");
        }

        System.out.println("Estado civil(s/c/v/d):");
        char estado = sc.next().charAt(0);
        int compareS = Character.compare(estado, 's');
        int compareC = Character.compare(estado, 'c');
        int compareV = Character.compare(estado, 'v');
        int compareD = Character.compare(estado, 'd');
        if (compareS != 0 && compareC != 0 && compareV != 0 && compareD != 0) {
            throw new Exception("Estado civil inválido");
        }

        System.out.println("Informações validadas com sucesso.");
    }
}
