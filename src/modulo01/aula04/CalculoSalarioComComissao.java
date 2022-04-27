package modulo01.aula04;
// Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele recebe uma
// comissão de 3% sobre o total das vendas até R$1.500,00 mais 5% sobre o que ultrapassar este valor,
// calcular e escrever o seu salário total.

import java.util.Scanner;

public class CalculoSalarioComComissao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double comissao = 0;

        System.out.println("Entre com o seu salário fixo:");
        double salarioFixo = sc.nextDouble();
        System.out.println("Entre com o valor de vendas efetuadas:");
        double vendasEfetuadas = sc.nextDouble();

        if (vendasEfetuadas > 1500) {
            comissao = 1500 * 0.03;
            vendasEfetuadas = (vendasEfetuadas - 1500) * 0.05;
            comissao += vendasEfetuadas;
        } else {
            comissao = vendasEfetuadas * 0.03;
        }

        System.out.printf("O seu salário total neste período é de %.2f",(salarioFixo + comissao));
    }
}
