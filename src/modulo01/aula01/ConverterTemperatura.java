package modulo01.aula01;

import java.util.Scanner;

public class ConverterTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius a ser convertida: ");
        double tempCelsius = sc.nextDouble();

        double tempFahrenheit = tempCelsius * 1.8 + 32;
        double tempKelvin = tempCelsius + 273.15;
        double tempRankine = tempCelsius * 1.8 + 32 + 459.67;
        double tempReaumur = tempCelsius * 0.8;

        System.out.printf("%.2f°C em:\nKelvin: %.2fK\nFahrenheit: %.2f°F\nRankine: %.2f\nReaumur: %.2f",
                tempCelsius, tempKelvin, tempFahrenheit, tempRankine, tempReaumur);
    }
}
