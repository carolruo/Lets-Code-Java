package modulo01.aula01;
//Faça um programa que receba o preço de custo do produto e exiba o valor de venda. O valor de venda receberá um
// acréscimo de acordo com o percentual informado pelo usuário.
import java.util.Scanner;

public class CalculoValorProdutoComAcrescimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor original do produto:");
        double valorProduto = sc.nextDouble();

        System.out.println("Digite o valor percentual do acrescimo:");
        double acrescimo = sc.nextDouble()/100;

        double valorProdutoComAcrescimo = valorProduto + valorProduto * acrescimo;

        System.out.printf("O valor de venda desse produto é de %.2f", valorProdutoComAcrescimo);

    }
}
