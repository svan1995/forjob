package com.bytedance.Exam;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        int[] count = new int[n];
        for (int i=n-1; i > 0; i--){
            for (int j=i-1; j>=0; j--){
                if (arr[j] >= arr[i]){
                    count[j]++;
                    break;
                }
            }
        }
        int max = 0;
        int index = 0;
        for (int i=0; i<n; i++){
            if (count[i] > max){
                max = count[i];
                index = i;
            }
        }
        System.out.println(arr[index]);
        scanner.close();
    }
}
