package modulo02.exercicio_cadastro_escola;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends Employee {

    private List<Integer> classesNumber = new ArrayList<>();
    private List<Subject> subjects = new ArrayList<>();

    public Teacher(String name, String cpf, String rg, String role, BigDecimal wage, List<Integer> classesNumber, List<Subject> subjects) {
        super(name, cpf, rg, role = "teacher", wage);
        this.classesNumber = classesNumber;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name=" + super.getName() +
                ", rg=" + super.getRg() +
                ", cpf=" + super.getCpf() +
                ", wage=" + super.getWage() +
                ", classesNumber=" + classesNumber +
                ", subjects=" + subjects +
                '}';
    }
}
