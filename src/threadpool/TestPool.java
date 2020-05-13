package threadpool;

import java.util.concurrent.TimeUnit;

public class TestPool {
    public static void main(String[] args) {
        DefaultThreadPool threadPool = new DefaultThreadPool();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        for (int i=0; i<10; i++){
//            threadPool.execute(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println("hello, world");
//                }
//            });
//        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadPool.shutdown();

    }

}
