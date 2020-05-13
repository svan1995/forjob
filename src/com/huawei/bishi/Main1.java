package com.huawei.bishi;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String str = scanner.nextLine();
            int sum = 0;
            int first = 0;
            int flag = 1;
            int thisNum = 0;
            boolean begin = true;
            for(int i=0 ; i<str.length();i++){
                if(isNum(str.charAt(i))){
                    if(begin == true){
                        first = i;
                        begin = false;
                    }

                }else if(str.charAt(i) == '+'){
                    thisNum = Integer.parseInt(str.substring(first,i));

                    if(flag > 0){
                        sum += thisNum;
                    }else {
                        sum -= thisNum;
                    }
                    flag = 1;
                    begin = true;
                }else if(str.charAt(i) == '-'){
                    thisNum = Integer.parseInt(str.substring(first,i));

                    if(flag > 0){
                        sum += thisNum;
                    }else {
                        sum -= thisNum;
                    }
                    flag = -1;
                    begin = true;
                }

            }
            thisNum = Integer.parseInt(str.substring(first,str.length()));
            if(flag > 0){
                sum += thisNum;
            }else {
                sum -= thisNum;
            }
            System.out.println(sum);
        }
        scanner.close();
    }

    private static boolean isNum(char c){
        if(c <= '9' && c >= '0'){
            return true;
        }else {
            return false;
        }
    }
}
