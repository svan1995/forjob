package swordoffer.Coll41_66;

public class P53 {
    public boolean isNumeric(char[] str) {
        String s = String.valueOf(str);
        System.out.println(s);
        return s.matches("[\\+\\-]?\\d*(\\.\\d+)?([eE][\\+\\-]?\\d+)?");
    }

    public static void main(String[] args) {
        char[] str = {'1', '0','0'};
        System.out.println(new P53().isNumeric(str));
    }
}
