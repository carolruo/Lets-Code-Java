package modulo03.ex01_calculadora;

public class Soma implements Calculo {

    @Override
    public double calculo(double n1, double n2) {
        return (n1 + n2);
    }
}
