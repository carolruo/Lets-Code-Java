package modulo01.aula04;
//Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas) onde o valor
// pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1.
//Na sequência mostra o valor lido e a relação de notas necessárias.

import java.util.Scanner;

public class CalculoDeCedulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor:");
        int valor = sc.nextInt();

        int[] nota = {100, 50, 20, 10, 5, 2, 1};
        int qtNota = 0;
        String result = "";

        int i = 0;
        while (valor != 0) {
            qtNota = valor / nota[i];
            if (qtNota != 0) {
                result = result + (qtNota + " nota(s) de R$" + nota[i] + "\n");
                valor = valor % nota[i];
            }
            i++;
        }
        System.out.println(result);
    }
}
