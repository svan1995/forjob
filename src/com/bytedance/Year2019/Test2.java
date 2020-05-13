package com.bytedance.Year2019;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = scanner.nextInt();
        int[] distance = new int[n];
        for (int i=0; i<n; i++){
            distance[i] = scanner.nextInt();
        }
        if (n<=2){
            System.out.println(0);
            return;
        }

        int left;
        int right = 2;
        int sum = 0;
        int num;
        while (right <n){
            left = getLeft(distance, right, max);
            if (left < 0){
                right++;
                continue;
            }
            num = right - left;
            if (num >= 2){
                sum += num * (num-1) / 2;
                sum = sum % 99997867;
            }
            right++;
        }
        System.out.println(sum);
    }

    private static int getLeft(int[] distance, int right, int max) {
        int left;
        int value = distance[right] - max;
        for (left = right-1; left>=0; left--){
            if (distance[left] < value){
                return left+1;
            }
        }
        return left+1;

    }
}
