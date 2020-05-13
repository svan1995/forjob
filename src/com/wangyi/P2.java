package com.wangyi;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s1 = str.substring(0,str.indexOf(','));
        String s2 = str.substring(str.indexOf(',')+1);

        StringBuilder sb1 = new StringBuilder();
        int sum = 0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) == '3'){
                sum++;
                sb1.append('2');

            }else {
                sb1.append(s1.charAt(i));
            }
        }
        int[] array = new int[s1.length()];
        int big = 0;
        int low = 0;
        for(int i=0; i<array.length;i++){
            array[i] = sb1.charAt(i) - s2.charAt(i);
            if(array[i] == 1){
                big++;
            }
            if(array[i] == -1){
                low++;
            }

        }

        int max = big > low ? big : low;
        sum += max;
        System.out.println(sum);


        sc.close();
    }
}
