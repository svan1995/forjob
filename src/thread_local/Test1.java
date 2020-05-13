package thread_local;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

public class Test1 implements Runnable{


//    ThreadLocal<Integer> number = new ThreadLocal<Integer>(){
//        @Override
//        protected Integer initialValue() {
//            return new Integer(1);
//        }
//    };

    ThreadLocal<Integer> number = ThreadLocal.withInitial(() -> new Integer(1));


    public static void main(String[] args) throws InterruptedException {
        Test1 obj = new Test1();
        Thread t1 = new Thread(obj, "1");
        t1.start();
        Thread.sleep(2000);
        Thread t2 = new Thread(obj, "2");
        t2.start();
        t2.join();

    }

    @Override
    public void run() {
        System.out.println("Thread Name= "+Thread.currentThread().getName()+
                " default Number = "+number.get());
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        number.set(new Integer(0));
        System.out.println("Thread Name= "+Thread.currentThread().getName()+
                " default Number = "+number.get());
    }
}
