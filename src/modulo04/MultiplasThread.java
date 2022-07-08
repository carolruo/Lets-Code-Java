package modulo04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiplasThread {

    public static void main(String[] args) {

        //Interface para tratar a concorrencia no java
        Runnable taskA = () -> System.out.println("Task a");
        Runnable taskB = () -> {
            for (int i = 0; i < 4; i++) {
                System.out.println("Task b");
            }
        };

        //Uma Thread pode receber um Runnable
//        System.out.println("start");
        //Disparando execuçoes
//        new Thread(taskA).start();
//        new Thread(taskB).start();
//        new Thread(taskA).start();
//        System.out.println("finish");

        ExecutorService service = Executors.newSingleThreadExecutor();

        try {
            System.out.println("start service");
            service.execute(taskA);
            service.execute(taskB);
            service.execute(taskA);
            System.out.println("finish service");
        } finally {
            service.shutdown();
        }

    }
}
