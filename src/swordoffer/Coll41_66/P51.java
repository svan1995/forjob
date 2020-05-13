package swordoffer.Coll41_66;

import java.util.Arrays;

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */
public class P51 {
    public int[] multiply(int[] A) {
        int[] leftArray = new int[A.length];
        int[] rightArray = new int[A.length];
        int[] result = new int[A.length];

        leftArray[0] = 1;
        for(int i=1; i<A.length;i++){
            leftArray[i] = leftArray[i-1] * A[i-1];
        }
        rightArray[A.length-1] = 1;
        for (int i=A.length-2;i>=0;i--){
            rightArray[i] = rightArray[i+1] * A[i+1];
        }

        for(int i=0;i<A.length;i++){
            result[i] = leftArray[i] * rightArray[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3};
        System.out.println(Arrays.toString(new P51().multiply(A)));
    }
}
