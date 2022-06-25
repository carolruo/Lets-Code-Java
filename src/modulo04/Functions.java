package modulo04;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


import static modulo04.Genero.F;
import static modulo04.Genero.M;

public class Functions {
    public static void main(String[] args) {
        Aluno maria = new Aluno("maria", 10.0, F);
        Aluno ana = new Aluno("ana", 9.0, F);
        Aluno joao = new Aluno("joao", 4.0, M);
        Aluno pedro = new Aluno("pedro", 6.0, M);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(maria);
        alunos.add(joao);
        alunos.add(pedro);
        alunos.add(ana);

        double v = somaNotaAlunosPorGenero(alunos, F);
        double c = somaNotaAlunosPorGenero(alunos, M);

        double optionalDouble = mediaAlunosPorGenero(alunos, M);

        List<Aluno> reprovados = alunosReprovados(alunos, M);


        System.out.println("Soma dos alunos: " + c);
        System.out.println("Soma das alunas: " + v);
        System.out.println(optionalDouble);
        System.out.println("Alunos reprovados homens: " + reprovados);

        //Collectors .average
        Long alunosn = alunos.stream().collect(Collectors.counting());
        System.out.println("Numero de alunos: " + alunosn);

        //Mapas nao podem ter chaves iguais
        //aluno -> aluno.getNota() == Aluno::getNota
        //(a, b) -> a) se tiver dois nomes duplicados, guarda só um, evita uma exception
        //(a, b) -> a + ", " + b) agrupar valores por uma key
        Map<String, Double> alunosMap = alunos
                .stream()
                .collect(Collectors.toMap(Aluno::getNome, Aluno::getNota, (a, b) -> a));

        System.out.println("Mapa : " + alunosMap);
        System.out.println("Joao no mapa: " + alunosMap.get("joao"));

        //Agrupar por genero
        Map<Genero, List<Aluno>> alunosAgrupar = alunos
                .stream()
                .collect(Collectors.groupingBy(Aluno::getGenero));

        System.out.println("homens:");
        alunosAgrupar.get(M).stream().forEach(System.out::println);

        //Agrupamento escolhendo Set
        Map<Genero, Set<Aluno>> alunosSet = alunos
                .stream()
                .collect(Collectors.groupingBy(Aluno::getGenero, Collectors.toSet()));

        //Nomes concatenados (só funciona com strings)
        String nomesConcatenados = alunos.stream().map(Aluno::getNome).collect(Collectors.joining(", "));
        System.out.println("Nomes join: " + nomesConcatenados);

        //Um método/chamada que agrupe o numero de alunos pelo tamanho do nome
        Map<Integer, Long> quantAlunosPorLengthDoNome = alunos
                .stream()
                .collect(Collectors.groupingBy(aluno -> aluno.getNome().length(), Collectors.counting()));
        System.out.println("Quantidade de letras de nome por alunos: " + quantAlunosPorLengthDoNome);

    }

    public static double somaNotaAlunosPorGenero(List<Aluno> alunos, Genero genero) {
        double soma = alunos
                .stream()
                .filter(aluno -> aluno.getGenero().equals(genero))
                .mapToDouble(Aluno::getNota)
                .sum();
        return soma;
    }

    public static List<Aluno> alunosReprovados(List<Aluno> alunos, Genero genero) {
        List<Aluno> reprovados = alunos
                .stream()
                .filter(aluno -> aluno.getGenero().equals(genero))
                .filter(aluno -> aluno.getNota() < 5.0)
                .toList();

        return reprovados;
    }

    public static double mediaAlunosPorGenero(List<Aluno> alunos, Genero genero) {
        double mediaNotaAlunos = alunos.stream()
                .filter(aluno -> aluno.getGenero().equals(genero))
                .mapToDouble(Aluno::getNota)
                .summaryStatistics().getAverage();

        return mediaNotaAlunos;
    }
}

//flatMap pega cada obj dentro de uma stream (com varias listas por ex.) e coloca todos dentro de uma stream
//Se vier optional double, tem que validar com ifPresent
class Aluno {
    private String nome;
    private Double nota;
    private Genero genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Aluno(String nome, Double nota, Genero genero) {
        this.nome = nome;
        this.nota = nota;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                ", genero=" + genero +
                '}';
    }
}

enum Genero {
    M, F;
}