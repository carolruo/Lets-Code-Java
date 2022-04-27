package modulo01.aula01;

public class ReajusteSalario {
    public static void main(String[] args) {
        double salarioFuncionario = 4000;

        double salarioComReajuste = salarioFuncionario + salarioFuncionario * 0.07;

        System.out.printf("O salário original de %.2f com reajuste ficou %.2f", salarioFuncionario, salarioComReajuste);
    }
}
