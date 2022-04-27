package modulo01.aula02;
//Elabore um programa que escreve seu nome completo na primeira linha, seu endereço na segunda, e o CEP e telefone na terceira.

public class EscreverDados {
    public static void main(String[] args) {
        String nomeCompleto = "Carolina Vendramini";
        String endereco = "Rua das Camelias, 92";
        int cep = 17526240;
        int telefone = 982232981;

        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Endereço: " + endereco);
        System.out.println("CEP: " + cep + ", telefone: " + telefone);
    }
}
