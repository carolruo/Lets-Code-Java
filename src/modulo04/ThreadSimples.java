package modulo04;

public class ThreadSimples {

    public static void main(String[] args) {

        new Thread(() -> System.out.println("Hello")).start();
        System.out.println("world");
    }
}
