package suanfa;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(10, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        int array[] = new int[20];
        for (int i=0; i<20; i++){
            array[i] = new Random().nextInt(100);
            queue.offer(array[i]);
        }

        for (int i=0; i<10; i++){
            System.out.println(queue.poll());
        }
    }
}
