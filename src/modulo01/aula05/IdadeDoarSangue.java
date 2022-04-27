package modulo01.aula05;
/*Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo que pergunte a idade de uma pessoa e diga
se ela pode doar sangue ou não. Use alguns dos operadores lógicos OU (||) e E (&&).
 */

import java.util.Scanner;

public class IdadeDoarSangue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a sua idade:");
        int idade = sc.nextInt();

        if (idade >= 18 && idade <= 67) {
            System.out.println("Você pode doar sangue.");
        }
        if (idade < 18 || idade > 67) {
            System.out.println("Você não pode doar sangue.");
        }
    }
}
