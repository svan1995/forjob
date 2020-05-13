package com.huawei.bishi;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int[] lowerCase = new int[26];
        int[] upperCase = new int[26];
        int[] illegalCase = new int[26];
        for(int i=0 ;i<str.length();i++){
            if(isLower(str.charAt(i))){
                lowerCase[str.charAt(i) - 'a'] ++;
            }
            if(isUpper(str.charAt(i))){
                upperCase[str.charAt(i) - 'A'] ++;
            }
        }
        for (int i= 0; i<illegalCase.length;i++){
            illegalCase[i] = (lowerCase[i] > upperCase[i] ? upperCase[i] : lowerCase[i]);
        }


//        System.out.println(Arrays.toString(illegalCase));

        while (hasCase(illegalCase)){
            int maxBegin = 0;
            int thisBegin = 0;
            int maxLength = 0;
            int thisLength = 0;
            for(int i=0 ;i<illegalCase.length;i++){
                if(illegalCase[i] > 0){
                    thisBegin = i;
                    thisLength =0;
                    while (illegalCase[i] > 0 && i<illegalCase.length){
                        i++;
                        thisLength ++;
                    }
                }
                if(thisLength > maxLength){
                    maxBegin = thisBegin;
                    maxLength = thisLength;
                }
            }
            for(int j=maxBegin; j<maxBegin+maxLength;j++){
                illegalCase[j]--;
//                System.out.print(new Character());
                System.out.print(new Character((char) ('A' + j)));
                System.out.print(new Character((char) ('a' + j)));
            }
            System.out.println();
        }

        scanner.close();
    }

    private static boolean isLower(char c){
        if(c >= 'a' && c <= 'z'){
            return true;
        }
        return false;

    }

    private static boolean isUpper(char c){
        if(c >= 'A' && c <= 'Z'){
            return true;
        }
        return false;

    }

    private static boolean hasCase(int[] illegalCase){
        for(int i = 0; i<26;i++){
            if(illegalCase[i] > 0){
                return true;
            }
        }
        return false;
    }
}
