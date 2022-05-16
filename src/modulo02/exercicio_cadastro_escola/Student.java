package modulo02.exercicio_cadastro_escola;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private int age;
    private Integer classNumber;
    private List<Subject> gradesBySubject = new ArrayList<>();

    public Student(String name, String cpf, String rg, int age, Integer classNumber, List<Subject> gradesBySubject) {
        super(name, cpf, rg);
        this.age = age;
        this.classNumber = classNumber;
        this.gradesBySubject = gradesBySubject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + super.getName() +
                ", rg=" + super.getRg() +
                ", cpf=" + super.getCpf() +
                ", age=" + age +
                ", classNumber=" + classNumber +
                ", gradesBySubject=" + gradesBySubject +
                '}';
    }

    public List<Subject> getGradesBySubject() {
        return gradesBySubject;
    }
}
