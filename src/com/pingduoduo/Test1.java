package com.pingduoduo;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m =scanner.nextInt();
        int []a = new int[n];
        for (int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        int sum = 0;
        if(a[0] >= 0 && a[n-1] >= 0){
            for (int i=0; i<m; i++){
                sum += a[i] * a[2*m-i];
            }
            System.out.println(sum);
            return;
        }
        if(a[0] <= 0 && a[n-1] <= 0){
            for (int i=0; i<m; i++){
                sum += a[n-1-i] * a[n-2*m+i];
            }
            System.out.println(sum);
            return;
        }


    }
}
