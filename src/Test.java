import java.util.concurrent.locks.ReentrantLock;

public class Test {
    static Object lock = new Object();
    static ReentrantLock lock1 = new ReentrantLock();

    public static void main(String[] args) {
//        Thread t1 = new Thread(new Job());
//        t1.start();
//        Thread t2 = new Thread(new Job());
//        t2.start();
        int a = 5;
        System.out.println(~a);

    }

    static class Job implements Runnable{

        @Override
        public void run() {
//            synchronized (lock){
//                while (true);
//            }
            lock1.lock();
            while (true){

            }
        }
    }


}
