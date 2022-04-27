package modulo01.aula03;
/*Escreva um programa que gera um número inteiro aleatório entre 1 e 10 e peça que o usuário informe o número correto,
você deve dar dicas caso o palpite esteja errado, informando se o número correto é maior ou menor do que o informado,
caso ele erre três vezes o programa se encerra e imprime uma mensagem informando que ele perdeu.
 */
import java.util.Scanner;

public class AdivinharNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numRandomico = (int)(Math.random()*10);
        System.out.println(numRandomico);

        for (int i = 0; i < 3; i++) {
            System.out.println("Tente adivinhar o número misterioso em 3 tentativas:");
            int numEntrada = sc.nextInt();
            if (numEntrada == numRandomico) {
                System.out.println("Parabéns, você acertou o número!");
                break;
            } else if (numEntrada > numRandomico){
                System.out.println("O número digitado é maior que o número misterioso");
                System.out.println("-----------------");
                if (i == 2) {
                    System.out.println("Vc esgotou suas tentativas");
                }
            } else {
                System.out.println("O número digitado é menor que o número misterioso");
                System.out.println("-----------------");
                if (i == 2) {
                    System.out.println("Vc esgotou suas tentativas");
                }
            }
        }
    }
}
