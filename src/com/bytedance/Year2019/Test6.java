package com.bytedance.Year2019;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int m = 1024 - x;
        int sum = 0;
        sum += m/64;
        m = m % 64;
        sum += m/16;
        m = m % 16;
        sum += m/4;
        m = m % 4;
        sum += m;

        System.out.println(sum);
    }
}
