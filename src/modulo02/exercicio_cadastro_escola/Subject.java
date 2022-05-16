package modulo02.exercicio_cadastro_escola;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private String name;
    private double grade;

    public Subject(String name) {
        this.name = name;
        this.grade = 0;
    }

    public Subject(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
