package com.bytedance.Year2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<String> list = new ArrayList<>();
        for (int i=0; i<n; i++){
            String str = check(scanner.nextLine());
            list.add(str);
        }
        list.forEach(s -> {
            System.out.println(s);
        });
        scanner.close();
    }

    private static String check(String str) {
        StringBuilder sb = new StringBuilder(str);
            for (int j=2; j<sb.length(); j++){
                if ((sb.charAt(j) == sb.charAt(j-1)) && (sb.charAt(j-1) == sb.charAt(j-2))){
                    sb.deleteCharAt(j);
                    j--;
                }
                else if(isPatternB(sb, j-3, j)){
                    sb.deleteCharAt(j);
                    j--;
                }
        }
        return sb.toString();
    }

    private static boolean isPatternB(StringBuilder sb, int i, int j) {
        if (i<0){
            return false;
        }
        return (sb.charAt(i) == sb.charAt(i+1)) && (sb.charAt(j) == sb.charAt(j-1));
    }

}
