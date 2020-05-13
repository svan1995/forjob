package suanfa;

import java.util.Arrays;

public class HeapSort{
    public static void heapSort(int[] a){
        buildHeap(a);
    }

    private static void buildHeap(int[] a) {
        int n = a.length;
        if (n < 2){
            return;
        }
        int last = (n-2) / 2;
        for (int i=last; i>=0; i--){
            flow(a,i,a.length-1);
        }
        for (int i=0; i<a.length-1; i++){
            swap(a,0, a.length-1-i);
            flow(a,0, a.length-2-i);
        }

    }

    private static void flow(int[] a, int start, int end) {
        int left = 2*start + 1;
        int right = 2*start + 2;
        int index = start;
        if (left <= end){
            if (a[index] < a[left]){
                index = left;
            }
        }
        if (right <= end){
            if (a[index] < a[right]){
                index = right;
            }
        }
        if (index != start){
            swap(a, index, start);
            flow(a, index, end);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    public static void main(String[] args) {
        int[] a = {11,3,55,634,44,55,33,25};
        buildHeap(a);
        System.out.println(Arrays.toString(a));
    }
}
