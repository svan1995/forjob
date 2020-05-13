package concurrency.chapter8;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest  {
    static CountDownLatch c = new CountDownLatch(3);

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            System.out.println(1);
            c.countDown();
            System.out.println(2);
            c.countDown();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            c.countDown();
        }).start();
        c.await();
        System.out.println(3);
    }
}
