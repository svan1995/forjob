package com.pingduoduo;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long k = scanner.nextInt();
        int[][] dp = new int[n+1][m+1];
        for (int i=0; i<=n; i++){
            dp[i][0] = i;
        }
        for (int i=0; i<=m; i++){
            dp[0][i] = i;
        }
        StringBuilder sb = new StringBuilder();
        if (k<=n){
            for (int i=0; i<k; i++){
                sb.append("a");
            }
            System.out.println(sb.toString());
            return;
        }
        if(k<=n+m){
            for (int i=0; i<n; i++){
                sb.append("a");
            }
            for (int j=n; j<k;j++){
                sb.append("b");
            }
            System.out.println(sb.toString());
            return;
        }


    }
}
