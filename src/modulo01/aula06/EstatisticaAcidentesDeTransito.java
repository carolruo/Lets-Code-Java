package modulo01.aula06;
/*Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito.
Foram obtidos os seguintes dados:
Código da cidade;
Número de veículos de passeio (em 2021);
Número de acidentes de trânsito com vítimas (em 2021).
Deseja-se saber:
Qual o maior e menor índice de acidentes de trânsito e a que cidade pertence;
Qual a média de veículos nas cinco cidades juntas;
Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
*/


import java.util.Scanner;

public class EstatisticaAcidentesDeTransito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] codigoCidade = new int[5];
        int[] veiculosDePasseio = new int[5];
        int[] acidentesTransitoComVitimas = new int[5];
        int menorIndice = Integer.MAX_VALUE;
        int maiorIndice = acidentesTransitoComVitimas[0];
        int cidadeMenosAcidentes = codigoCidade[0];
        int cidadeMaisAcidentes = codigoCidade[0];
        int somaVeiculos = 0;
        int somaAcidentes = 0;
        int cidadesPequena = 0;

        for (int i = 0; i < codigoCidade.length; i++) {
            System.out.println("Código da cidade:");
            codigoCidade[i] = sc.nextInt();
            System.out.println("Número de veículos de passeio (em 2021)");
            veiculosDePasseio[i] = sc.nextInt();
            System.out.println("Número de acidentes de trânsito com vítimas (em 2021)");
            acidentesTransitoComVitimas[i] = sc.nextInt();

            somaVeiculos += veiculosDePasseio[i];

             if (veiculosDePasseio[i] < 2000) {
                 somaAcidentes += acidentesTransitoComVitimas[i];
                 cidadesPequena++;
             }

             if (menorIndice > acidentesTransitoComVitimas[i]) {
                 menorIndice = acidentesTransitoComVitimas[i];
                 cidadeMenosAcidentes = codigoCidade[i];
             }
             if (maiorIndice < acidentesTransitoComVitimas[i]) {
                 maiorIndice = acidentesTransitoComVitimas[i];
                 cidadeMaisAcidentes = codigoCidade[i];
             }
        }
        System.out.printf("Maior índice de acidentes de trânsito é de %d, da cidade de código %d\n",
                maiorIndice, cidadeMaisAcidentes);
        System.out.printf("Menor índice de acidentes de trânsito é de %d, da cidade de código %d\n",
                menorIndice, cidadeMenosAcidentes);

        System.out.println("Média de veículos nas cinco cidades juntas: " + (somaVeiculos/codigoCidade.length));
        System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: " + (somaAcidentes/cidadesPequena));
    }
}
