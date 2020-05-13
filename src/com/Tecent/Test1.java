package com.Tecent;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=0; i<n; i++){
            int len = scanner.nextInt();
            String string = scanner.next();
            len = string.length();
            if (len < 11)
                System.out.println("NO");
            else {
                int index = string.indexOf("8");
                if (index == -1 || len - index < 11){
                    System.out.println("NO");
                }
                else {
                    System.out.println("YES");
                }
            }
        }
    }
}
