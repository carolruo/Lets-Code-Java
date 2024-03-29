package modulo04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class JavaIO {
    public static void main(String[] args) throws IOException {
        File file = new File("arq.txt");

        FileOutputStream fos = new FileOutputStream(file);
        byte[] bytes = "testando".getBytes();
        fos.write(bytes);

        // N IO utilitários
        // Path //mostrar o caminho do arquivo

        Path path = Paths.get("arq.txt");
        List<String> lerArq = Files.readAllLines(path);
        // lerArq.stream().forEach(System.out::println);

        byte[] bytes1 = "Um novo test...".getBytes();
        Files.write(Paths.get("arquivonovo.txt"), bytes1);

        Path file2 = Path.of("campeonatos-brasileiro-pontos-corridos.csv");
        List<String> csvListString = Files.readAllLines(file2);
        List<String[]> strings = Files.readAllLines(file2).stream().map(str -> str.split(";")).toList();
//        strings.stream().forEach(System.out::println);
//        csvListString.stream().forEach(System.out::println); //printa linha por linha

        // Files.readAllLines(Paths.get("arquivonovo.txt")).stream().forEach(System.out::println);
    }
}
