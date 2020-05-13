package jvm.chapter3;

public class MinorGC {
    public static void main(String[] args) {
        byte[] a1, a2, a3, a4;
        a1 = new byte[2*1024*1024];
        a1 = new byte[2*1024*1024];
        a1 = new byte[2*1024*1024];
        a1 = new byte[4*1024*1024];
    }
}
