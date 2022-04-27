package modulo01.aula04;
//Uma loja está levantando o valor total de todas as mercadorias em estoque.
// Escreva um algoritmo que permita a entrada das seguintes informações:
//a quantidade de produtos que irá cadastrar
//para cada produto:
//o nome do produto
//o número total de mercadorias no estoque;
//o valor unitário da mercadoria.
//Imprimir o valor total em estoque e a média de valor das mercadorias.

import java.util.Scanner;

public class CalculoDosProdutosDoEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos:");
        int quantidadeProdutos = sc.nextInt();
        sc.nextLine();

        String nomeProdutos[] = new String[quantidadeProdutos];
        Integer numeroEstoque[] = new Integer[quantidadeProdutos];
        Double valorUnitario[] = new Double[quantidadeProdutos];

        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.printf("Digite o nome do produto %d:\n", i);
            nomeProdutos[i] = sc.nextLine();
            System.out.printf("Digite o numero no estoque do produto %d:\n", i);
            numeroEstoque[i] = sc.nextInt();
            System.out.printf("Digite o valor unitário do produto %d:\n", i);
            valorUnitario[i] = sc.nextDouble();
            sc.nextLine();
        }

        double valorEstoque = 0;
        double valorMercadorias = 0;

        for (int i = 0; i < quantidadeProdutos; i++) {
            valorEstoque += valorUnitario[i] * numeroEstoque[i];
            valorMercadorias += valorUnitario[i];
        }

        System.out.printf("O valor total em estoque é %.2f. A média de valor das mercadorias é %.2f",
                valorEstoque, (valorMercadorias/quantidadeProdutos));
    }
}
