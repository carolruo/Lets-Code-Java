package modulo02.exercicio_funcionarios;

public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Luis", "Silva", 10, 25.5);

        funcionario.nomeCompleto();

        funcionario.calcularSalario();

        funcionario.incrementarHoras(8);

        funcionario.calcularSalario();
    }
}
