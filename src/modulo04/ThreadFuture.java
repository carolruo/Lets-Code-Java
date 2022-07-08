package modulo04;

import java.util.Random;
import java.util.concurrent.*;

public class ThreadFuture {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        NonceNumber task = new NonceNumber();
        ExecutorService service = Executors.newSingleThreadExecutor(); //Iniciando schedule
        Future<Integer> resultadoFuturo = service.submit(task); //Uma promessa de uma entrega não certa

        while (resultadoFuturo.isDone()) {
            Thread.sleep(100);
        }

        System.out.println("nonce " + resultadoFuturo.get());

        service.shutdown();

    }

    private static class NonceNumber implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            Thread.sleep(2000);
            return new Random().nextInt();
        }
    }
}
