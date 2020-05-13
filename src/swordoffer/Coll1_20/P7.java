package swordoffer.Coll1_20;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class P7 {
    public int Fibonacci(int n) {
        int result = 0;
        if (n == 1 || n == 2) {
            result = 1;
        } else {
            int a = 1;
            int b = 1;
            for (int i = 2; i < n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
        }
        return result;
    }
}
