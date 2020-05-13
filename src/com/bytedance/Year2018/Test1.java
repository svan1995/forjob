package com.bytedance.Year2018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, ArrayList<Integer>> data = new HashMap<>();
        for (int i=0; i<n; i++){
            int x = scanner.nextInt();
            if (data.get(x) == null){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                data.put(x, list);
            }
            else {
                data.get(x).add(i);
            }
        }
        int[] result = new int[scanner.nextInt()];
        for (int i=0; i<result.length; i++){
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            int k = scanner.nextInt();
            int num = 0;
            ArrayList<Integer> list = data.get(k);
            for (Integer v : list){
                if ((left-1) <= v && v < right){
                    num++;
                }
                if (v >= right)
                    break;
            }
            result[i] = num;
        }

        for (int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }

        scanner.close();
    }
}
