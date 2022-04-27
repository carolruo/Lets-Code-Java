package modulo01.aula05;
/*Uma loja utiliza o código V para transação à vista e P para transação a prazo. Faça um programa que receba
código e valor de 15 transações usando laços de repetição. Calcule e mostre:
O valor total das compras à vista
O valor total das compras a prazo.
O valor total das compras efetuadas
O valor da primeira prestação das compras a prazo, sabendo-se que essas serão pagas em três vezes
*/

import java.util.Scanner;

public class TransacoesVistaPrazo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int transacoes = 2;
        double totalComprasVista = 0;
        double totalComprasPrazo = 0;
        double totalComprasEfetuadas = 0;

        for (int i = 0; i < transacoes; i++) {
            System.out.println("Digite V para transação à vista ou P para transação a prazo:");
            char transacaoTipo = sc.nextLine().toUpperCase().charAt(0);
            if (transacaoTipo != 'V' && transacaoTipo != 'P') throw new Exception("Tipo de transação inválida.");

            System.out.println("Digite o valor da compra:");
            double valorCompra = sc.nextDouble();
            sc.nextLine();

            totalComprasEfetuadas += valorCompra;

            if (transacaoTipo == 'V') {
                totalComprasVista += valorCompra;
            } else {
                totalComprasPrazo += valorCompra;
            }
        }
        double primeiraPrestacao = totalComprasPrazo / 3;

        System.out.println("Valor total das compras à vista: R$" + totalComprasVista);
        System.out.println("Valor total das compras a prazo: R$" + totalComprasPrazo);
        System.out.println("Valor total das compras efetuadas: R$" + totalComprasEfetuadas);
        System.out.printf("Valor da primeira prestação das compras a prazo (em 3x): R$%.2f", primeiraPrestacao);
    }
}
