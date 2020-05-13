package suanfa;

import java.util.Arrays;
import java.util.Random;

public class TopK {
    static final int K=10;
    private static int[] minHeap = new int[K];

    private static void buildHeap(){
        if (minHeap.length == 1){
            return;
        }
        int k = (minHeap.length - 2) / 2;
        for (int i=k; i>=0; i--){
            flowNode(i);
        }
    }

    private static void flowNode(int index) {
        int tmp = index;
        int left = index*2 + 1;
        int right = index*2 + 2;
        if (left < minHeap.length && minHeap[left] < minHeap[index]){
            index = left;
        }
        if (right < minHeap.length && minHeap[right] < minHeap[index]){
            index = right;
        }
        if (index != tmp){
            swap(tmp,index);
            flowNode(index);
        }

    }

    private static void swap(int tmp, int index) {
        int temp = minHeap[tmp];
        minHeap[tmp] = minHeap[index];
        minHeap[index] = temp;
    }

    public static void main(String[] args) {
        int array[] = new int[20000];
        for (int i=0; i<20000; i++){
            array[i] = new Random().nextInt(9999);
        }
        for (int i=0; i<K; i++){
            minHeap[i] = array[i];
        }
        buildHeap();
        System.out.println(Arrays.toString(minHeap));
        for (int i=K; i<array.length; i++){
            if (array[i] > minHeap[0]){
                minHeap[0] = array[i];
                flowNode(0);
            }
        }
        System.out.println(Arrays.toString(minHeap));
    }
}
