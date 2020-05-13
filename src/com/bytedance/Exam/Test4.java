package com.bytedance.Exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test4 {
    private static ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
    private static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if (str.length()==1 && str.charAt(0)=='0'){
            return;
        }
        getSubList(str, 0);

        ArrayList<String> strings = new ArrayList<>();
        for (ArrayList<Integer> integerArrayList : lists){
            StringBuilder sb = new StringBuilder();
            for (Integer integer : integerArrayList){
                sb.append((char) ('A' + integer - 1));
            }
            strings.add(sb.toString());
        }
        Collections.sort(strings);
        for (String string : strings){
            System.out.println(string);
        }
        scanner.close();
    }

    private static void getSubList(String str, int i) {
        if (i == (str.length()-1)){
            list.add(Integer.parseInt(str.substring(i,i+1)));
            lists.add(new ArrayList<>(list));
            list.remove(list.size()-1);
        }
        else if (i==(str.length()-2) && isChar(str.substring(i, i+2))){
            if (!isZero(str.substring(i,i+2))){
                list.add(Integer.parseInt(str.substring(i, i+1)));
                getSubList(str, i+1);
                list.remove(list.size()-1);
            }
            list.add(Integer.parseInt(str.substring(i, i+2)));
            lists.add(new ArrayList<>(list));
            list.remove(list.size()-1);


        }
        else if (i==(str.length()-2) && !isChar(str.substring(i, i+2))){
            list.add(Integer.parseInt(str.substring(i, i+1)));
            getSubList(str, i+1);
            list.remove(list.size()-1);
        }
        else if (!isChar(str.substring(i, i+2))){
            list.add(Integer.parseInt(str.substring(i,i+1)));
            getSubList(str, i+1);
            list.remove(list.size()-1);
        }
        else {

            if (!isZero(str.substring(i,i+2))){
                list.add(Integer.parseInt(str.substring(i,i+1)));
                getSubList(str, i+1);
                list.remove(list.size()-1);
            }
            list.add(Integer.parseInt(str.substring(i,i+2)));
            getSubList(str, i+2);
            list.remove(list.size()-1);

        }
    }

    private static boolean isChar(String string) {
        if (Integer.parseInt(string) <= 26){
            return true;
        }
        return false;
    }

    private static boolean isZero(String string){
        int x = Integer.parseInt(string);
        if (x== 10 || x == 20){
            return true;
        }
        return false;
    }
}
