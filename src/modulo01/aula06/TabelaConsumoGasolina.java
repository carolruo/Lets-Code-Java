package modulo01.aula06;

/*Faça um programa que carregue uma lista com os modelos de cinco carros (exemplo de modelos: FUSCA, GOL, VECTRA etc).
Carregue uma outra lista com o consumo desses carros, isto é, quantos quilômetros cada um desses carros
faz com um litro de combustível. Calcule e mostre:
a- O modelo do carro mais econômico;
b- Quantos litros de combustível cada um dos carros cadastrados consome para percorrer uma distância de 1000 quilômetros
e quanto isto custará, considerando um que a gasolina custe R$ 7,25 o litro.
c- Abaixo segue uma tela de exemplo. A disposição das informações deve ser o mais próxima possível ao exemplo.
Os dados são fictícios e podem mudar a cada execução do programa.
*/
public class TabelaConsumoGasolina {
    public static void main(String[] args) {

        final double GASOLINA_LITRO_PRECO = 7.25;
        String[] veiculos = {"fusca", "gol", "uno", "Vectra", "Pegeout"};
        double[] kmLitro = {7, 10, 12.5, 9, 14.5};
        double menorKm = kmLitro[0];
        String carroMenorConsumo = "";

        System.out.println("Comparativo de Consumo de Combustível\n");

        for (int i = 0; i < 5; i++) {
            System.out.println("Veículo " + (i + 1));
            System.out.println("Nome: " + veiculos[i]);
            System.out.println("Km por litro: " + kmLitro[i]);

            if (menorKm < kmLitro[i]) {
                menorKm = kmLitro[i];
            }
        }

        System.out.println("Resultado Final");
        for (int i = 0; i < 5; i++) {
            double litrosConsumidos = 1000 / kmLitro[i];
            double custoTotal = litrosConsumidos * GASOLINA_LITRO_PRECO;

            System.out.printf("%d - %-15s - %7.2f - %7.2f litros - R$ %7.2f\n",
                    (i + 1), veiculos[i].toLowerCase(), kmLitro[i], litrosConsumidos, custoTotal);

            if (menorKm == kmLitro[i]) {
                carroMenorConsumo = veiculos[i];
            }
        }
        System.out.println("O menor consumo é do " + carroMenorConsumo.toLowerCase());

    }

}
