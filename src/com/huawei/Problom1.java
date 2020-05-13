package com.huawei;

import java.util.Scanner;

public class Problom1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            Long result = 0L;
            String valueStr = scanner.next().toLowerCase();
            if(valueStr.length() <=2 || !(valueStr.substring(0,2).equals("0x"))){
                throw new RuntimeException("input type is wrong!");
            }

            int size = valueStr.length() - 2;
            int j = 2;
            for(int i = size-1; i>=0; i--){
                int k = changeToNum(valueStr.charAt(j));
                result += k * myPow(i);

                j++;
            }
            System.out.println(result);
        }

        scanner.close();
    }

    private static int myPow(int i) {
        if(i == 0){
            return 1;
        }
        return 16*myPow(i-1);
    }

    private static int changeToNum(char c) {
        int n;
        switch (c){
            case '0':
                n = 0;
                break;
            case '1':
                n = 1;
                break;
            case '2':
                n = 2;
                break;
            case '3':
                n = 3;
                break;
            case '4':
                n = 4;
                break;
            case '5':
                n = 5;
                break;
            case '6':
                n = 6;
                break;
            case '7':
                n = 7;
                break;
            case '8':
                n = 8;
                break;
            case '9':
                n = 9;
                break;
            case 'a':
                n = 10;
                break;
            case 'b':
                n = 11;
                break;
            case 'c':
                n = 12;
                break;
            case 'd':
                n = 13;
                break;
            case 'e':
                n = 14;
                break;
            case 'f':
                n = 15;
                break;
            default:
                n = -1;
                break;
        }

        if(n == -1){
            throw new RuntimeException("type error!");
        }

        return n;
    }


}
