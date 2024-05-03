package day;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class thread {
    //池中所保存的线程数，包括空闲线程。
    final static int corePoolSize = 10;
    //池中允许的最大线程数。
    final static int maximumPoolSize = 20;
    //当线程数大于核心线程时，此为终止前多余的空闲线程等待新任务的最长时间
    final static long keepAliveTime = 200;
    //执行前用于保持任务的队列5，即任务缓存队列
    final static ArrayBlockingQueue<Runnable> workQueue =new ArrayBlockingQueue<Runnable>(5);

        //构建一个线程池，正常线程数量为5，最大线程数据为10，等待时间200
        static   ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                corePoolSize, maximumPoolSize, keepAliveTime, TimeUnit.MINUTES,	workQueue);


}
