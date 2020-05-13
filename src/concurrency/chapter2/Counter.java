package concurrency.chapter2;

import java.util.ArrayList;
import java.util.List;

public class Counter {
    private int i = 0;
    private Object lock = new Object();

    public static void main(String[] args) {
        Counter counter = new Counter();
        List<Thread> threads = new ArrayList<>();
        for(int i=0; i<10; i++){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<1000;i++){
                        counter.count();
                    }
                }
            });
            threads.add(t);
        }
        for(Thread t:threads){
            t.start();
        }
        for(Thread t: threads){
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(counter.i);
    }

    private void count(){
        synchronized (lock){
            i++;
        }
    }
}
