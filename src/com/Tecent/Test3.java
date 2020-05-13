package com.Tecent;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=0; i<n; i++){
            int k = scanner.nextInt();
            int leftSum = scanner.nextInt();
            int rightSum = scanner.nextInt();
            int leftMin = leftSum;
            int rightMin = rightSum;
            int lefLength = 1;
            int rightLength = 1;
            for (int j=2; j<k; j++){
                int x = scanner.nextInt();
                if (leftSum < rightSum){
                    if (lefLength <= rightLength){
                        if (leftMin > x){
                            leftMin = x;
                        }
                        leftSum += x;
                        lefLength++;
                    }
                    else {

                    }
                }
            }
        }


    }
}
