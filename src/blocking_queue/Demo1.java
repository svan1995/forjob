package blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo1 {
    static ArrayBlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);
    public static void main(String[] args) throws InterruptedException {
        blockingQueue.put(1);
        Integer i = blockingQueue.take();
        Integer poll = blockingQueue.poll();
        System.out.println(poll);
//        Integer i2 = blockingQueue.take();
    }
}
