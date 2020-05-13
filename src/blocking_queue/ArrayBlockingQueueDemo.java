package blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ArrayBlockingQueueDemo  {
    private final static ArrayBlockingQueue<Apple> queue = new ArrayBlockingQueue<Apple>(1);

    public static void main(String[] args) {
        new Thread(new Producer(queue)).start();
        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();
        new Thread(new Consumer(queue)).start();
    }



}

class Apple{}

class Producer implements Runnable{
    private final ArrayBlockingQueue<Apple> queue;

    public Producer(ArrayBlockingQueue<Apple> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            produce();
        }

    }

    private void produce(){
            try {
                Apple apple = new Apple();
                queue.put(apple);
                System.out.println(Thread.currentThread().getName()+">>>生产Apple:"+apple);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


    }
}

class Consumer implements Runnable{

    private ArrayBlockingQueue<Apple> mAbq;
    Consumer(ArrayBlockingQueue<Apple> arrayBlockingQueue){
        this.mAbq = arrayBlockingQueue;
    }

    @Override
    public void run() {
        while (true){
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                comsume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    private void comsume() throws InterruptedException {
        Apple apple = mAbq.take();
        System.out.println(Thread.currentThread().getName()+">>>消费Apple:"+apple);
    }
}

