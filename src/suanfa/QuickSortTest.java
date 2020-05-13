package suanfa;

import java.util.Arrays;
import java.util.Stack;

public class QuickSortTest {
    public void quickSort(int [] a){
        if (a == null)
            return;
        qSort(a, 0, a.length - 1);
    }

    public void qSort(int[] a, int low, int high) {
        int pivot;
        if (low >= high)
            return;
        pivot = partition(a, low, high);
        qSort(a, low, pivot-1);
        qSort(a, pivot+1, high);
    }

    public void qSort2(int[] a, int low, int high){
        int pivot;
        if (low >= high)
            return;
        Stack<Integer> stack = new Stack<>();
        stack.push(low);
        stack.push(high);
        while (!stack.isEmpty()){
            high = stack.pop();
            low = stack.pop();
            pivot = partition(a, low, high);
            if (low < pivot-1){
                stack.push(low);
                stack.push(pivot - 1);
            }
            if (high > pivot+1){
                stack.push(pivot+1);
                stack.push(high);
            }
        }
    }

    public int partition(int[] a, int low, int high) {
        int left = low;
        int key = a[low];
        while (low < high){
            while (low < high && a[high] >= key)
                high--;
            while (low < high && a[low] <= key)
                low++;
            swap(a, low, high);
        }
        swap(a, left, low);
        return low;

    }

    private void swap(int[] a, int low, int high) {
        int temp = a[low];
        a[low] = a[high];
        a[high] = temp;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,1};
        new QuickSortTest().quickSort(a);
        System.out.println(Arrays.toString(a));
    }
}
