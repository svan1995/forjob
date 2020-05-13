package concurrency.chapter8;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class BankWaterService implements Runnable {

    private CyclicBarrier c = new CyclicBarrier(4, this);

    private ExecutorService pool = Executors.newFixedThreadPool(4);

    private ConcurrentHashMap<String, Integer> count = new ConcurrentHashMap<>();

    private void count(){
        for (int i=0; i<4; i++){

            pool.execute(new Runnable() {
                @Override
                public void run() {
                    count.put(Thread.currentThread().getName(), 1);
                    try {
                        c.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            });

        }
    }

    @Override
    public void run() {
        System.out.println(111);
        AtomicInteger sum = new AtomicInteger();
        count.forEach((k, v)->{
            sum.addAndGet(v);
        });
        System.out.println(sum.get());
    }

    public static void main(String[] args) {
        new BankWaterService().count();

    }
}
