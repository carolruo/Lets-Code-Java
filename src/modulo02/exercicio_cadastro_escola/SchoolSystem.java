package modulo02.exercicio_cadastro_escola;

import java.util.ArrayList;
import java.util.List;

public class SchoolSystem {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();

        School school = new School("usp", students, employees, teachers);

        Subject mathJohn = new Subject("math", 8);
        Subject historyJohn = new Subject("history", 7);
        List<Subject> subjectsJohn = new ArrayList<>();
        subjectsJohn.add(mathJohn);
        subjectsJohn.add(historyJohn);
        Student john = new Student("John", "122343", "45246", 12, 1, subjectsJohn);

        Subject math = new Subject("math", 9);
        Subject history = new Subject("history", 10);
        List<Subject> subjectsMaria = new ArrayList<>();
        subjectsMaria.add(math);
        subjectsMaria.add(history);
        Student maria = new Student("Maria", "232324", "52346", 12, 2, subjectsMaria);

        school.addStudent(john);
        school.addStudent(maria);

        school.showStudents();

        school.showStudentByCpf("122343");

        school.studentAvg("122343");

    }
}
