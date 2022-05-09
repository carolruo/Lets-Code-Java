package modulo02.exercicio_funcionarios;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private Integer horasTrabalhadas;
    private Double valorPorHora;

    public Funcionario(String nome, String sobrenome, Integer horasTrabalhadas, Double valorPorHora) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public void nomeCompleto() {
        System.out.println(nome + " " + sobrenome);
    }

    public void calcularSalario() {
        double salario = horasTrabalhadas * valorPorHora;
        System.out.println("Salário: " + salario);
    }

    public void incrementarHoras(int horas) {
        valorPorHora += horas;
    }
}
