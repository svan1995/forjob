package jvm.outofmemory;

import threadpool.ThreadPool;

import java.util.LinkedList;
import java.util.List;

public class HeapOOM {
    public static void main(String[] args) throws InterruptedException {
        List<Object> list = new LinkedList<>();
        while (true){
            list.add(new Object());
        }
    }

}
