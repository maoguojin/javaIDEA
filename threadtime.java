import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liuhuifang
 * @date 2022/5/26 11:31
 */
public class threadtime {
    static ExecutorService pool = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws InterruptedException {
        List list = new ArrayList();
        for(int i = 1; i<=100; i++){
            list.add(i);
        }
        Long start = System.currentTimeMillis();
        for(int i = 0; i<list.size(); i++){
            Thread.sleep(100);
        }
        System.out.println("=====同步执行：耗时"+(System.currentTimeMillis()-start)+"毫秒======");
        Long start1 = System.currentTimeMillis();
        CountDownLatch latch = new CountDownLatch(10);
        for(int i = 0; i<latch.getCount(); i++){
            pool.execute(new Test(latch, i, list));
        }
        latch.await();
        System.out.println("=====异步执行：耗时"+(System.currentTimeMillis()-start1)+"毫秒======");
    }

    static class Test implements Runnable{
        private CountDownLatch latch;
        private int i;
        private List list;
        Test(CountDownLatch latch, int i, List list){
            this.latch = latch;
            this.i = i;
            this.list = list;
        }


        @Override
        public void run() {
            for(int a = i*10; a<(i+1)*10; a++){
                // 执行任务逻辑
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            latch.countDown();
        }
    }
}

