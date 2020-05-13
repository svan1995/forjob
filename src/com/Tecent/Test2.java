package com.Tecent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        int n = scanner.nextInt();
        for (int i=0; i < n; i++){
            int num = scanner.nextInt();
            int t = scanner.nextInt();
            for (int j=0; j<num; j++){
                list.add(t);
            }
        }
        Collections.sort(list);
        for (int i=0; i<list.size()/2;i++){
            int num = list.get(i) + list.get(list.size()-1-i);
            if (num > max)
                max = num;
        }
        System.out.println(max);
    }
}
