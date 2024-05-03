import java.util.concurrent.*;

import static java.lang.Thread.sleep;

public class threadpoolexectors {
    static ExecutorService es = new ThreadPoolExecutor(10, 10, 2000L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>(10), Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.DiscardPolicy());
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            es.execute(new thread1());
        }
    }

}
class thread1 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}