package modulo01.aula05;
/*Leia a velocidade máxima permitida em uma avenida e a velocidade com que o motorista estava
dirigindo nela e calcule a multa que uma pessoa vai receber, sabendo que são pagos:
a) 50 reais se o motorista estiver ultrapassar em até 10km/h a velocidade permitida
(ex.: velocidade máxima: 50km/h; motorista a 60km/h ou a 56km/h);
b) 100 reais, se o motorista ultrapassar de 11 a 30 km/h a velocidade permitida.
c) 200 reais, se estiver acima de 31km/h da velocidade permitida. */

import java.util.Scanner;

public class CalcularMulta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a velocidade máxima permitida na avenida:");
        double velMax = sc.nextDouble();

        System.out.println("Velocidade com que o motorista estava dirigindo:");
        double velMotorista = sc.nextDouble();

        double difVel = velMotorista - velMax;

        if (difVel >= 31) {
            System.out.println("Multa de R$200.");
        } else if (difVel < 31 && difVel >= 11) {
            System.out.println("Multa de R$100.");
        } else if (difVel < 11 && difVel > 0) {
            System.out.println("Multa de R$50.");
        } else {
            System.out.println("Dentro do limite de velocidade.");
        }
    }
}
