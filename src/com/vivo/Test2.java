package com.vivo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int[] a = {6,3};
        String solution = solution(a);
        System.out.println(solution);
    }

    private static String solution(int[] input) {

        int num = input[0];
        int x = input[1];
        x = x % num;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i<=num; i++){
            list.add(i);
        }
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (!list.isEmpty()){
            index = (index + x-1) % list.size();
            Integer s = list.get(index);
            sb.append(String.valueOf(s));
            sb.append(" ");
            list.remove(index);
//            index++;

        }

        return sb.toString();
    }
}
