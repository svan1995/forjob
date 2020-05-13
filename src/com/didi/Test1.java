package com.didi;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            double sum = 0;
            double x = m;
            for (int i= 0; i<n; i++){
                sum += x;
                x = Math.sqrt(x);
            }
            System.out.printf("%.2f", sum);
        }
    }
}
