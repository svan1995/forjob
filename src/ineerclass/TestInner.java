package ineerclass;

import concurrency.chapter8.Test;

public class TestInner {
    private int age = 100;


    public class Inner{
        private int age;
        private String name;

        public void print(){
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(TestInner.this.age);
        }

    }

    public static class StaticInner{
        public void print(){
            System.out.println("this is a static inner class!");
        }
    }

    public static void main(String[] args) {
        TestInner inner = new TestInner();
        Inner in = inner.new Inner();
        in.print();
        TestInner.StaticInner staticInner = new TestInner.StaticInner();
        staticInner.print();
    }
}
