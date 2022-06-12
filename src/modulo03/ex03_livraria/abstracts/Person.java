package modulo03.ex03_livraria.abstracts;

import java.time.LocalDate;

public abstract class Person {

    private String name;
    private String rg;
    private String cpf;
    private LocalDate birthDate;

    public Person(String name, String rg, String cpf, LocalDate birthDate) {
        this.name = name;
        this.rg = rg;
        this.cpf = cpf;
        this.birthDate = birthDate;
    }

    public String getNome() {
        return name;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
