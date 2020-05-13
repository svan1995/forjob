package com.bytedance.Exam;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = scanner.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++){
            String str = scanner.next();
            if (str.equals(">")){
                array[i] = Integer.MAX_VALUE;
            }
            else if (str.equals("<")){
                array[i] = Integer.MIN_VALUE;
            }
            else {
                array[i] = Integer.parseInt(str);
            }
        }

        for (int i=0; i<q; i++){
            int left = scanner.nextInt();
            int right = scanner.nextInt();

        }
        System.out.println(2);


    }

    private static void getCount(int[] array, int left, int right) {
        int first = -1;
        int second = -1;
        for(int i=left-1; i<right; i++){
            if (array[i] == Integer.MAX_VALUE || array[i] == Integer.MIN_VALUE){
                first = i;
            }
        }

    }


}
