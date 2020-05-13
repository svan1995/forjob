package suanfa;

import java.util.Arrays;

public class InsertSort {
    public static void insertSort(int[] a){
        for (int i=1; i<a.length; i++){
            int j;
            int temp = a[i];
            for (j=i-1; j>=0 && a[j]>temp; j--){
                a[j+1] = a[j];
            }
            a[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] {5,3,5,3,2,4,1};
        insertSort(a);
        System.out.println(Arrays.toString(a));
    }
}
