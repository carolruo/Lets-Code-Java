package modulo04;

public class ThreadPause {

    public static void main(String[] args) {

        var thread = new Thread(() -> pause());
        thread.setDaemon(true); //Ela vai executar e finalizar todo o escopo de execução, encerra imediatamente
        thread.start();
        System.out.println("fim programa");
    }

    private static void pause() {
        try {
            Thread.sleep(2_000); //Ficar em standby
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread finalizada");
    }
}
