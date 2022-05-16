package modulo02.exercicio_cadastro_escola;

public class Person {
    private String name;
    private String cpf;
    private String rg;

    public Person(String name, String cpf, String rg) {
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public String getRg() {
        return rg;
    }
}
