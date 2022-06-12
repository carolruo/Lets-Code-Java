package modulo03.ex03_livraria.modelo;

import modulo03.ex03_livraria.abstracts.Pessoa;

import java.time.LocalDate;

public class Cliente extends Pessoa {

    private boolean maiorDeIdade;

    public Cliente(String nome, String rg, String cpf, LocalDate dataNascimento) {
        super(nome, rg, cpf, dataNascimento);
        this.maiorDeIdade = verificaIdade();
    }

    private boolean verificaIdade() {
        int idade = LocalDate.now().getYear() - super.getDataNascimento().getYear();

        if(idade < 18) {
            return maiorDeIdade = false;
        }
        return maiorDeIdade = true;
    }

    public boolean getMaiorDeIdade() {
        verificaIdade();
        return maiorDeIdade;
    }
}
