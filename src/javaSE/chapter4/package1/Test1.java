package javaSE.chapter4.package1;

import concurrency.chapter8.Test;

public class Test1 implements Cloneable {
    protected int a;
    int b;

    void test() throws CloneNotSupportedException {
        Test1 test1 = new Test1();
        Test1 clone = (Test1) test1.clone();
        System.out.println(clone.a);
        System.out.println(test1);
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        Test1 test1 = new Test1();
        test1.test();
    }
}
