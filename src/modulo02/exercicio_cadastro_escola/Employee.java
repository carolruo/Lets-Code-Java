package modulo02.exercicio_cadastro_escola;

import java.math.BigDecimal;

public class Employee extends Person {

    private String role;
    private BigDecimal wage;

    public Employee(String name, String cpf, String rg, String role, BigDecimal wage) {
        super(name, cpf, rg);
        this.role = role;
        this.wage = wage;
    }

    public BigDecimal getWage() {
        return wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + super.getName() +
                ", rg=" + super.getRg() +
                ", cpf=" + super.getCpf() +
                ", role='" + role + '\'' +
                ", wage=" + wage +
                '}';
    }
}
