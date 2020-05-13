package suanfa;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array){
//        quickSort_1(array,0,array.length-1);
        quickSort_2(array, 0, array.length - 1);
    }

    private static void quickSort_1(int[] array, int left, int right) {
        if (right <= left)
            return;
        int key = array[left];
        int i = left;
        int j = right;
        while (i < j){
            while (array[j] >= key && i < j){
                j--;
            }
            while (array[i] <= key && i < j){
                i++;
            }
            if (i<j ){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        array[left] = array[j];
        array[j] = key;
        quickSort_1(array,left, i-1);
        quickSort_1(array,i+1, right);

    }

    private static void quickSort_2(int[] array, int left, int right){
        int i = left;
        int j = right;
        int key = array[left];
        while (i < j){
            while (i<j && array[j] >= key){
                j--;
            }
            array[i] = array[j];
            while (i<j && array[i] <= key){
                i++;
            }
            array[j] = array[i];
        }
        array[i]  = key;
        if (left < j){
            quickSort_2(array, left, j-1);
        }
        if (i < right){
            quickSort_2(array, i+1, right);
        }
    }



    public static void main(String[] args) {
        int[] a = new int[] {1,2};
        quickSort(a);
        System.out.println(Arrays.toString(a));
    }
}
