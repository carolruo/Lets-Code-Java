package modulo01.aula04;
//Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armazenar os nomes lidos em um vetor.
// Após isto, o algoritmo deve permitir a leitura de mais 1 nome qualquer de pessoa e depois escrever a mensagem
// ACHEI, se o nome estiver entre os 10 nomes lidos anteriormente (guardados no vetor), ou NÃO ACHEI caso contrário

import java.util.Scanner;

public class EncontrarNomeDaLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[4];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite um nome:");
            nomes[i] = sc.nextLine();
        }

        System.out.println("Agora entre com um nome para saber se ele está contido na lista de nomes:");
        String nomeEscolhido = sc.nextLine();

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(nomeEscolhido)) {
                System.out.println("ACHEI");
                break;
            }
            if (i == (nomes.length - 1)) {
                System.out.println("NÃO ACHEI");
            }
        }
    }
}
