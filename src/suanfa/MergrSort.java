package suanfa;

import java.util.Arrays;

public class MergrSort {

    public static void mergeSort(int a[]){
        int[] tempA = new int[a.length];
        mSort(a, tempA, 0, a.length-1);
    }

    private static void mSort(int[] a, int[] tempA, int left, int right) {
        if (left < right){
            int mid = (left + right) / 2;
            mSort(a, tempA, left, mid);
            mSort(a, tempA, mid+1, right);
            merge(a, tempA, left, mid+1, right);
        }
    }

    private static void merge(int[] a, int[] tempA, int left, int right, int end) {
        int index = left;
        int leftEnd = right;
        int length = end - left + 1;
        while (left < leftEnd && right <= end){
            if (a[left] <= a[right]){
                tempA[index++] = a[left++];
            }else {
                tempA[index++] = a[right++];
            }
        }
        while (left < leftEnd){
            tempA[index++] = a[left++];
        }
        while (right <= end){
            tempA[index++] = a[right++];
        }
        for (int i=0; i<length; i++){
            a[end] = tempA[end];
            end--;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] {5,3,5,3,2,4,1};
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }


}
