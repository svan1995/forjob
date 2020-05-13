package test_interrupt;


import java.util.concurrent.TimeUnit;

//当一个线程处于被阻塞状态或者试图执行一个阻塞操作时，
//使用Thread.interrupt()方式中断该线程，注意此时将会抛出一个InterruptedException的异常
public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(){
            @Override
            public void run(){
                try {
                    while (true) {
                        //当前线程处于阻塞状态，异常必须捕捉处理，无法往外抛出
                        TimeUnit.SECONDS.sleep(2);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Interruted When Sleep");
                    boolean interrupt = this.isInterrupted();
                    //中断状态被复位
                    System.out.println("interrupt:"+interrupt);
                }

            }
        };

        t1.start();
        Thread.sleep(5000);
        t1.interrupt();
    }
}
