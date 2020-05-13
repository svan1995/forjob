package com.bytedance.Year2018_3;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int last = scanner.nextInt();
        int[] number = new int[n];
        for (int i=0; i<n; i++){
            number[i] = scanner.nextInt();
        }

        int begin = last-1;
        int sum = 0;
        while (true){
            if (number[begin] > 0){
                number[begin]--;
                sum++;
                if (begin > 0){
                    begin--;
                }
                else {
                    begin = n-1;
                }
            }
            else{
                number[begin] = sum;
                break;
            }
        }

        for (int i=0; i<n; i++){
            System.out.print(number[i] + " ");
        }

        scanner.close();
    }
}
