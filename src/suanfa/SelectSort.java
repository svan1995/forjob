package suanfa;

import java.util.Arrays;

public class SelectSort {
    public static void selectSort(int a[]){
        for (int i=0; i<a.length; i++){
            int min = i;
            for (int j=i+1; j<a.length; j++){
                if (a[j] < a[min]){
                    min = j;
                }
            }
            if (i != min){
                swap(a, i, min);
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = new int[] {5,3,5,3,2,4,1};
        selectSort(a);
        System.out.println(Arrays.toString(a));
    }
}
