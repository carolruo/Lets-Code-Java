package modulo01.aula04;
//Leia um número inteiro que representa um código de DDD para discagem interurbana.
//Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
//	Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
//DDD nao cadastrado
//Entrada
//A entrada consiste de um único valor inteiro.
//Saída
//Imprima o nome da cidade correspondente ao DDD existente na entrada.
//Imprima DDD não cadastrado caso não exista o DDD correspondente ao número digitado.
//DDD DESTINO
//61Brasília
//71Salvador
//11São Paulo
//21Rio de Janeiro
//32Juiz de Fora
//19Campinas
//27Vitória
//31Belo Horizonte

import java.util.Scanner;

public class DescobrirDdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o DDD:");
        int ddd = sc.nextInt();

        switch (ddd) {
            case 61 -> System.out.println("Brasília");
            case 71 -> System.out.println("Salvador");
            case 11 -> System.out.println("São Paulo");
            case 21 -> System.out.println("Rio de Janeiro");
            case 32 -> System.out.println("Juiz de Fora");
            case 19 -> System.out.println("Campinas");
            case 27 -> System.out.println("Vitória");
            case 31 -> System.out.println("Belo Horizonte");
            default -> System.out.println("DDD não cadastrado");
        }
    }

}
