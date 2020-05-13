package com.Tecent;

import java.util.HashSet;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i=0; i<n; i++)
            a[i] = scanner.nextInt();
        for (int i=0; i<n; i++)
            b[i] = scanner.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                int num = a[i] + b[j];
                if (set.contains(num))
                    set.remove(num);
                else
                    set.add(num);
            }
        }
        System.out.println(set);
        int pre = 0;
        for (Integer x : set){
            pre = pre ^ x;
        }
        System.out.println(pre);
    }
}
