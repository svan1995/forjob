package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class TestHashMap {
    static Map<String, Object> hashMap = new ConcurrentHashMap<>();
    static AtomicInteger i=new AtomicInteger(0);


    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new job());
        Thread t2 = new Thread(new job());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(hashMap.size());
    }


    static class job implements Runnable{

        @Override
        public void run() {
            for (int j=0; j<1000000;j++){
                hashMap.put("key"+i.incrementAndGet(), "hello");
            }
        }
    }

}
