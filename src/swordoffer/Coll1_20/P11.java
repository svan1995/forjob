package swordoffer.Coll1_20;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class P11 {
    public int NumberOf1(int n) {
        if(n==0) {
            return 0;
        }
        if(n<0) {
            n = n+Integer.MAX_VALUE+1;

            return t1(n)+1;
        }

        return t1(n);
    }

    private int t1(int n) {
        int sum = 0;
        int yu;
        while(n>0) {

            yu = n % 2;
            n = n/2;
            if(yu==1) {
                sum++;
            }
        }
        return sum;
    }
}
