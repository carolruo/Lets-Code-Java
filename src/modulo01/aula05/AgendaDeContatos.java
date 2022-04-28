package modulo01.aula05;
/*Crie uma agenda que armazena, código da pessoa, número do telefone, idade. Sua agenda deve possibilitar:
(1) – inserir um contato
(2) – Remover um contato
*/

import java.util.Scanner;

public class AgendaDeContatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomes[] = new String[5];
        int telefones[] = new int[5];
        int idade[] = new int[5];
        int contadorContatos = 0;

        System.out.println("~~~~~~Bem-vindo à sua agenda~~~~~~");

        boolean controle = true;
        while (controle) {
            System.out.println("\n\tEscolha o que deseja fazer:\n" +
                    "\t(1) Visualizar contatos\n" + "\t(2) Adicionar contato\n" + "\t(3) Remover contato\n" + "\t(4) Sair");
            int opcaoEscolhida = sc.nextInt();
            sc.nextLine();

            switch (opcaoEscolhida) {
                case 1:
                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i] == null) {
                            System.out.println("Contato vazio");
                        } else {
                            if (nomes[i] != null) {
                                System.out.printf("Código nº%d | %s, telefone: %d, idade: %d\n", i, nomes[i], telefones[i], idade[i]);
                            }
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i] == null) {
                            System.out.println("Nome do contato:");
                            nomes[i] = sc.nextLine();
                            System.out.println("Telefone:");
                            telefones[i] = sc.nextInt();
                            System.out.println("Idade:");
                            idade[i] = sc.nextInt();
                            sc.nextLine();
                            contadorContatos++;
                            System.out.println("Deseja adicionar mais um contato?(s/n)");
                            char resp = sc.nextLine().charAt(0);
                            if (resp != 's') {
                                break;
                            } else if (resp == 's' && contadorContatos == 5) {
                                System.out.println("A lista de contatos está cheia. Remova algum contato antes de adicionar.");
                                break;
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome do contato que deseja remover:");
                    String nomeRemover = sc.nextLine();
                    boolean excluido = false;
                    for (int i = 0; i < nomes.length; i++) {
                        if (nomeRemover.equals(nomes[i])) {
                            nomes[i] = null;
                            System.out.println("Contato removido com sucesso.");
                            contadorContatos--;
                            excluido = true;
                        }
                    }
                    if (!excluido) {
                        System.out.println("Nome não encontrado na lista.");
                        break;
                    }
                    break;

                case 4:
                    System.out.println("Fechando a agenda de contatos. Até mais~~");
                    controle = false;
                    break;

                default:
                    System.out.println("Parece que você digitou uma opção inválida.");
            }
        }
    }
}
