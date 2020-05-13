package suanfa;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] a){
        boolean flag = false;
        for (int i=a.length-1; i>=0; i--){
            for (int j=0; j<i; j++){
                if (a[j+1] < a[j]){
                    swap(a, j, j+1);
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
    }

    private static void swap(int[] a, int j, int i) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = new int[] {5,3,5,3,2,4,1};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
