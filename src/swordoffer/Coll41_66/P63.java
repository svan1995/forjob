package swordoffer.Coll41_66;

import java.util.Comparator;
import java.util.PriorityQueue;

public class P63 {

    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(11, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });


    public void Insert(Integer num) {
       if(minHeap.size() == 0 && maxHeap.size()==0){
           maxHeap.add(num);
           return;
       }
       if(minHeap.size() == 0 && maxHeap.size() == 1){
           if(num > maxHeap.peek()){
               minHeap.add(num);
           }
           else {
               int temp = maxHeap.poll();
               maxHeap.add(num);
               minHeap.add(temp);
           }
           return;
       }
       int min = minHeap.peek();
       int max = maxHeap.peek();
       int minCount = minHeap.size();
       int maxCount = maxHeap.size();
       if(maxCount == minCount){
           if(num <= min){
               maxHeap.add(num);
           }
           else {
               maxHeap.add(minHeap.poll());
               minHeap.add(num);
           }
       }
       else {
           if(num >= max){
               minHeap.add(num);
           }
           else {
               minHeap.add(maxHeap.poll());
               maxHeap.add(num);
           }
       }




    }

    public Double GetMedian() {
        if(minHeap.size() == maxHeap.size()){
            return ((minHeap.peek() + maxHeap.peek())) / 2.0;

        }
        else{
            return (double)maxHeap.peek();
        }
    }

    public static void main(String[] args) {
        P63 p63 = new P63();
        p63.Insert(2);
        p63.Insert(5);
//        p63.Insert(3);
//        p63.Insert(5);
//        p63.Insert(0);
        System.out.println(p63.GetMedian());
    }
}
