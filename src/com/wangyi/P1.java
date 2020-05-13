package com.wangyi;

import java.util.HashSet;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        HashSet<String> set= new HashSet<>();
        int n=0;
        while (n<total){
            set.add(sc.next());
            n++;
        }
        System.out.println(set.size());
        sc.close();
    }
}
