package com.Tecent;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Test4 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        TreeSet<Integer> set = new TreeSet();
        int k = scanner.nextInt();
        for (int i=0; i<n; i++){
            set.add(scanner.nextInt());
        }
        System.out.println(set);
        if (set.contains(0)){
            set.remove(0);
        }
        int size = set.size();
        int[] a = new int[size];
        int pre = 0;
        int i = 0;
        for (Integer num : set){
            a[i++] = num - pre;
            pre = num;
        }
        for (int j=0; j<k; j++){
            if (j<a.length)
                System.out.println(a[j]);
            else
                System.out.println(0);
        }
    }
}
