package modulo03.ex03_livraria.abstracts;

import java.time.LocalDate;

public abstract class Pessoa {

    private String nome;
    private String rg;
    private String cpf;
    private LocalDate dataNascimento;

    public Pessoa(String nome, String rg, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
