package cursor.hw13.execute;

import java.util.concurrent.atomic.AtomicInteger;

public class Executor {

    private static boolean flag = false;
    private static AtomicInteger count = new AtomicInteger();

    public static void execute() {

        Thread counter = incrementCount();
        Thread stopCounter = stopIncrement();

        counter.start();
        stopCounter.start();
    }

    private static Thread stopIncrement() {
        return new Thread(() -> {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true;
            System.out.println("counter make " + count + " operations!");
        });
    }

    private static Thread incrementCount() {
        return new Thread(() -> {
            while (!flag) {
                System.out.println(count.incrementAndGet());
            }
        });
    }
}
