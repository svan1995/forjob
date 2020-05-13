package com.didi;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }
//        int min  = Integer.MAX_VALUE;
//        int thismin;
//        for (int i=0; i<n-(m-1); i++){
//            thismin = sum(a, i, i+(m-2));
//            for (int j=i+(m-1);j<n;j++){
//                thismin += a[j];
//                if (thismin < min)
//                    min = thismin;
//            }
//        }

        int min = Integer.MAX_VALUE;
        int thismin = sum(a,0,m-1);
        if (thismin < min)
            min = thismin;
        int low = 0;
        int high = m;
        while (high < n){
            if(a[high] > 0){
                if (min <= 0 && thismin + a[high] > 0){
                    if (high + m >= n-1)
                        break;
                    else {
                        low = high + 1;
                        high = low + m;
                    }
                }

            }
            else {
                thismin = thismin + a[high];
                high++;
            }
            if (thismin < min){
                min = thismin;
            }
        }
        System.out.println(min);
        scanner.close();
    }

    private static int sum(int[] a, int i, int j) {
        int result = 0;
        for (int x=i;x<=j;x++){
            result += a[x];
        }
        return result;
    }


}
