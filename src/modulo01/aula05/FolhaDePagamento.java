package modulo01.aula05;
/*Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do imposto de Renda,
que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do
salário bruto, mas não é descontado (é a empresa que deposita.)

O salário líquido corresponde ao salário bruto menos os descontos O programa deverá pedir ao usuário o valor da
sua hora e a quantidade de horas trabalhadas no mês.

a. Desconto do IR;
b. Salário Bruto até R$900,00 (inclusive) – Isento;
c. Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;
d. Salário bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
e. Salário bruto acima de 2500 – Desconto de 20%.
*/

import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor da sua hora:");
        double valorHora = sc.nextDouble();
        System.out.println("Quantidade de horas trabalhadas no mês: ");
        double horas = sc.nextDouble();

        double salarioBruto = valorHora * horas;
        double descontoIr, descontoSindicato, fgts, salarioLiquido;

        if (salarioBruto > 2500) {
            descontoIr = salarioBruto * 0.2;
        } else if (salarioBruto > 1500) {
            descontoIr = salarioBruto * 0.1;
        } else if (salarioBruto > 900) {
            descontoIr = salarioBruto * 0.05;
        } else {
            descontoIr = 0;
        }

        descontoSindicato = salarioBruto * 0.03;
        fgts = salarioBruto * 0.11;

        salarioLiquido = salarioBruto - descontoIr - descontoSindicato;

        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Salário Líquido: " + salarioLiquido);
        System.out.println("Desconto do Imposto de Renda: " + descontoIr);
        System.out.println("Desconto do Sindicato: " + descontoSindicato);
        System.out.println("FGTS: " + fgts);

    }
}
