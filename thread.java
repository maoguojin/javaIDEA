import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

public class thread {
    static ExecutorService pool = Executors.newFixedThreadPool(3);
    public static void main(String[] args) {
        pool.execute(()->{
            for (int i = 0; i < 20; i++) {
                System.out.println(1);
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        pool.execute(()->{
            for (int i = 0; i < 20; i++) {
                System.out.println(2);
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        pool.execute(()->{
            for (int i = 0; i < 20; i++) {
                System.out.println(3);
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

    }
}
