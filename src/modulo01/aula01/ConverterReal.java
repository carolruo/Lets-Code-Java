package modulo01.aula01;
//Crie um algoritmo que realize a conversão do valor em real para as seguintes moedas:
//Dólar Euro Libra

public class ConverterReal {
    public static void main(String[] args) {
        double valorReal = 30;

        double cotacaoDolar = 5;
        double cotacaoEuro = 6;
        double cotacaoLibra = 7;

        double realEmDolar = valorReal / cotacaoDolar;
        double realEmEuro = valorReal / cotacaoEuro;
        double realEmLibra = valorReal / cotacaoLibra;

        System.out.printf("R$%.2f\nDolar: %.2f\nEuro: %.2f\nLibra: %.2f", valorReal, realEmDolar, realEmEuro, realEmLibra);
    }
}
