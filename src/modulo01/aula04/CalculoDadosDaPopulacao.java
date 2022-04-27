package modulo01.aula04;
//A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Faça um algoritmos
// para coletar dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever:
//Média de salário da população
//Média do número de filhos
//Maior salário dos habitantes
//Percentual de pessoas com salário menor que R$ 150,00
//Obs: O final da leitura dos dados se dará com a entrada de um “salário negativo”.

import java.util.Scanner;

public class CalculoDadosDaPopulacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int habitantes=0;
        int totalFilhos = 0;
        double maiorSalario = -1;
        double salarioTotal = 0;
        int salarioMenor = 0;
        boolean isHabitanteValido = true;

        while(isHabitanteValido) {
            System.out.println("Digite o salário:");
            double salario = sc.nextDouble();

            System.out.println("Digite o número de filhos:");
            int filhos = sc.nextInt();

            isHabitanteValido = salario >= 0; //verifica

            if(isHabitanteValido) {
                habitantes ++;
                totalFilhos += filhos;
                salarioTotal += salario;

                if (salario > maiorSalario) {
                    maiorSalario = salario;
                }

                if (salario < 150) {
                    salarioMenor++;
                }
            }
        }

        System.out.println("Média do salário da população: " + salarioTotal / habitantes);
        System.out.println("Média do número de filhos: " + totalFilhos / habitantes);
        System.out.println("Maior salário: " + maiorSalario);
        System.out.println("Percentual de salário inferior a R$150: " + (salarioMenor/habitantes) * 100);
    }
}
