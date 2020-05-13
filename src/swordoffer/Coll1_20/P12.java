package swordoffer.Coll1_20;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * 保证base和exponent不同时为0
 */
public class P12 {
    public double Power(double base, int exponent) {
        if(base == 0) {
            return 0.0;
        }
        if(exponent == 0) {
            return 1;
        }
        double result;

        int fu = exponent<0 ? -1 : 1;
        int e = exponent<0 ? -exponent : exponent;
        int flag = e % 2;
        if(flag == 0) {
            result = Power(base, e/2) * Power(base, e/2);
        }
        else {
            result = Power(base, e/2) * Power(base, e/2) * base;
        }
        return fu>0 ? result : 1/result;

    }
}
