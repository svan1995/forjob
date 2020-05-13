package com.vivo;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }

    private static int solution(int[] input) {

        Arrays.sort(input);
        int left = 0;
        int right = 0;
        int leftNum = 2;
        int rightNum = 1;
        left = input[0] + input[2];
        right = input[1];
        int pre = 2;
        for (int i=3; i<input.length; i++){
            if (leftNum == rightNum){

            }
            else {

            }
        }

        return 1;
    }
}
