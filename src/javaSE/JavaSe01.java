package javaSE;

import java.util.ArrayList;

public class JavaSe01 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1.hashCode());
        String s3 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3.hashCode());
//
//        StringBuilder
//
//        Object obj;
//
//        ArrayList
    }
}
