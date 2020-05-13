package com.huawei;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> sortSet = new HashSet<>();
        int n = scanner.nextInt();
        for(int i = 0;i<n;i++){
            int x = scanner.nextInt();
            sortSet.add(x);
        }
        int size = sortSet.size();
        Integer sortArray[] = new Integer[size];
        sortSet.toArray(sortArray);
        Arrays.sort(sortArray);
        for(int i=0; i<sortArray.length;i++){
            System.out.println(sortArray[i]);
        }

    }


}
