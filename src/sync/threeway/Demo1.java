package sync.threeway;

public class Demo1 implements Runnable {

    public static long i=0;

    public void increase()  {

        i++;
    }

    @Override
    public void run() {
        for (long j=0;j<1000000;j++){
            increase();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Demo1 demo1 = new Demo1();
        Thread thread1 = new Thread(demo1);
        Thread thread2 = new Thread(demo1);
//        Thread.sleep(5000);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(i);

    }
}
