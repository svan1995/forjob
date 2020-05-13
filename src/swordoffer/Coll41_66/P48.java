package swordoffer.Coll41_66;

public class P48 {
    public int Add(int num1,int num2) {
        while (num2 != 0){
            int temp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        return num1;

    }

    public static void main(String[] args) {
        System.out.println(new P48().Add(5,6));
    }
}
