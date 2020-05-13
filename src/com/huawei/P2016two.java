package com.huawei;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class P2016two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        HashSet<Character> set = new HashSet<>();
//        for(int i=0; i<str.length();i++){
//            set.add(str.charAt(i));
//        }
//        for(char c : set){
//            System.out.print(c);
//        }

        while (scanner.hasNextLine()){
            String str = scanner.nextLine();
            HashMap<Integer,Character> map = new HashMap<>();
            int k = 0;
            for (int i=0;i<str.length();i++){

                char c = str.charAt(i);
                if(map.containsValue(c)){
                    continue;
                }else {
                    map.put(k++, c);
                }
            }

            for(int i = 0; i < map.size();i++){
                System.out.print(map.get(i));

            }
            System.out.println();
        }


//        Object
//        LinkedHashMap
//        HashMap
//        TreeMap
        scanner.close();

    }


}
