package swordoffer.Coll1_20;


import swordoffer.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class P3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        while (listNode != null){
            result.add(0, listNode.val);
            listNode = listNode.next;
        }
        return result;
    }
}
