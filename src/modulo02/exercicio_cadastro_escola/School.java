package modulo02.exercicio_cadastro_escola;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String name;
    private List<Student> students = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();

    public School(String name, List<Student> students, List<Employee> employees, List<Teacher> teachers) {
        this.name = name;
        this.students = students;
        this.employees = employees;
        this.teachers = teachers;
    }

    public void studentAvg(String cpf) {
        double sum = 0;
        int subjects = 0;
        for (Student s: students) {
            if (s.getCpf().equals(cpf)) {
                for (Subject subject: s.getGradesBySubject()) {
                    sum += subject.getGrade();
                    subjects++;
                }
            }
        }
        System.out.println("Student total average is " + (sum/subjects));
    }

    public void showStudents() {
        for (Student s: students) {
            System.out.println(s);
        }
    }

    public void showEmployees() {
        for (Employee emp: employees) {
            System.out.println(emp);
        }
    }

    public void showTeachers() {
        for (Teacher t: teachers) {
            System.out.println(t);
        }
    }

    public void showStudentByCpf(String cpf) {
        for (Student s: students) {
            if (s.getCpf().equals(cpf)) {
                System.out.println(s);
            }
        }
    }

    public void showEmployeeByCpf(String cpf) {
        for (Employee emp: employees) {
            if (emp.getCpf().equals(cpf)) {
                System.out.println(emp);
            }
        }
    }

    public void showTeacherByCpf(String cpf) {
        for (Teacher t: teachers) {
            if (t.getCpf().equals(cpf)) {
                System.out.println(t);
            }
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public  void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void modifyStudent(Student student) {
        for (Student s: students) {
            if (student.getCpf().equals(s.getCpf())) {
                s = student;
            }
        }
    }

    public void modifyEmployee(Employee employee) {
        for (Employee emp: employees) {
            if (employee.getCpf().equals(emp.getCpf())) {
                emp = employee;
            }
        }
    }

    public void modifyTeacher(Teacher teacher) {
        for (Teacher t: teachers) {
            if (teacher.getCpf().equals(t.getCpf())) {
                t = teacher;
            }
        }
    }

    public void removeStudent(Student student) {
        for (Student s: students) {
            if (student.getCpf().equals(s.getCpf())) {
                students.remove(s);
            }
        }
    }

    public void removeEmployee(Employee employee) {
        for (Employee emp: employees) {
            if (employee.getCpf().equals(emp.getCpf())) {
                employees.remove(emp);
            }
        }
    }

    public void removeTeacher(Teacher teacher) {
        for (Teacher t: teachers) {
            if (teacher.getCpf().equals(t.getCpf())) {
                students.remove(t);
            }
        }
    }
}
