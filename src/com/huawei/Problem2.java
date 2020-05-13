package com.huawei;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int i = scanner.nextInt();
            if(i == 0){
                break;
            }
            System.out.println(solution(i));
        }


        scanner.close();
    }

    private static int solution(int n){
        if(n <=1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return n/3 + solution(n/3 + n%3);
    }
}
