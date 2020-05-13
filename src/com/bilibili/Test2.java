package com.bilibili;

import java.util.Scanner;


public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i=1; i<=n; i++){
            for (int j=i; j<=n;j++){
                if (sum(i, j) == n){
                    count++;
                }
                if (sum(i,j) > n){
                    break;
                }
            }
        }
        System.out.println(count);

        scanner.close();
    }

    private static int sum(int i, int j) {
        return (i+j)*(j-i+1)/2;
    }
}
