package com.bilibili;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder(str);
        String[] list = str.split(" ");
        String delimiter1 = list[0];
        String delimiter2 = list[1];
        String content = str.substring(str.indexOf(delimiter2)+2);
        String[] pairs = content.split(delimiter1);
        int count = pairs.length;
        ArrayList<String> result = new ArrayList<>();
        for (int i=0; i<pairs.length; i++){
            pairs[i] = pairs[i].trim();
            String[] kv = pairs[i].split(delimiter2);
            if (kv.length < 2){
                count--;
                continue;
            }
            result.add(kv[0]);
            result.add(kv[1]);

        }
        System.out.println(count);
        for (int i=0; i<count; i++){
            System.out.println(result.get(i*2) + " " + result.get(i*2+1));
        }



        scanner.close();
    }
}
