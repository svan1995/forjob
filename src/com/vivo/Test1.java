package com.vivo;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }

    private static int solution(int[] input) {
        if (input.length == 0)
            return -1;
        if (input.length == 1){
            return 0;
        }
        int sum = 0;
        int last = input.length-1;
        while (last > 0){
            for (int i=0; i<last;i++){
                if (input[i] + i >= last){
                    sum++;
                    last = i;
                    break;
                }
                return -1;
            }
        }
        return sum;


    }
}
