package com.bytedance.Exam;

import java.util.LinkedList;

public class Test5 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        System.out.println(linkedList.removeFirst());
    }
}
