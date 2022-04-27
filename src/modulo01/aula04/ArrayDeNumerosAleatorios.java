package modulo01.aula04;
//Escreva um código para armazenar 10 valores aleatórios até o número 100 do tipo double em um array;

public class ArrayDeNumerosAleatorios {
    public static void main(String[] args) {

        double[] numerosAleatorios = new double[10];

        for (int i = 0; i < 10; i++) {
            numerosAleatorios[i] = Math.random()*100;
        }
    }
}
