package modulo01.aula01;

public class CalculoLevantarMassaComCavalos {
    public static void main(String[] args) {

        double massa = 700, altura = 2, tempo = 1;

        double cavalos = (massa * altura / tempo ) / 745.6999;

        System.out.printf("Serão necessários %0.2f cavalos", cavalos);
    }
}
