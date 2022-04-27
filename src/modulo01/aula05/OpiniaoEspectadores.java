package modulo01.aula05;
/*Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e a sua opinião em relação ao filme:
3 - ótimo,
2 - bom,
1 - regular
 Faça um programa que receba a idade e a opinião de 5 espectadores e que calcule e mostre:
A média das idades das pessoas que responderam ótimo;
A quantidade de pessoas que respondeu regular;
A percentagem de pessoas que respondeu “bom” entre todos os espectadores analisados.
*/

import java.util.Scanner;

public class OpiniaoEspectadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int participantes = 5;
        double somaIdadeOtimo = 0;
        int respostaOtimo = 0;
        int respostaRegular = 0;
        int respostaBom = 0;

        for (int i = 0; i < participantes; i++) {
            System.out.println("Qual é sua opinião em relação ao filme?(ótimo/bom/regular)");
            String resposta = sc.nextLine();
            System.out.println("qual é a sua idade?");
            int idade = sc.nextInt();
            sc.nextLine();

            if (resposta.equals("ótimo")) {
                somaIdadeOtimo += idade;
                respostaOtimo++;
            } else if (resposta.equals("regular")) {
                respostaRegular++;
            } else if (resposta.equals("bom")) {
                respostaBom++;
            } else {
                System.out.println("Opinião não computada, tente novamente.");
                participantes++;
            }
        }

        if (respostaOtimo == 0) {
            System.out.println("Não houveram espectadores que acharam o filme ótimo.");
        } else {
            System.out.println("Média das idades das pessoas que responderam ótimo: " + somaIdadeOtimo / respostaOtimo);

        }

        System.out.println("Quantidade de pessoas que respondeu regular: " + respostaRegular);
        System.out.println("Percentagem de pessoas que respondeu “bom” entre todos os espectadores analisados: "
                + (respostaBom * 100 / 5) + "%");
    }

}
