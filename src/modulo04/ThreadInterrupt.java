package modulo04;

public class ThreadInterrupt {

    private static boolean valor = false;

    public static void main(String[] args) throws InterruptedException {

        final var mainThread = Thread.currentThread(); //Thread principal

        new Thread(() -> {

            try {
                Thread.sleep(2_000); //Ficar em standby
                valor = true;
                mainThread.interrupt(); // lança uma interrupted exception
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        while (!valor) {
            System.out.println("Enviando mensagem");
            Thread.sleep(500);
        }

        System.out.println("Mensagem enviada");

    }
}
