package com.pingduoduo;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n+1];
        int sum = 0;
        for (int i=0; i<m; i++){
            int low = scanner.nextInt();
            int high = scanner.nextInt();
            for(int j=low; j<=high; j++){
                if(a[j] == 0){
                    sum++;
                    a[j] = 1;
                }
            }
            System.out.println(sum);
        }
    }
}
