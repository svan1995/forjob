package swordoffer.Coll1_20;

import swordoffer.ListNode;

import java.util.List;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class P14 {
    public ListNode FindKthToTail(ListNode head, int k){
        ListNode pre = head;
        ListNode after = head;

        for (int i=0;i<k;i++){
            if (after == null){
                return null;
            }
            after = after.next;
        }
        while (after!=null){
            after = after.next;
            pre = pre.next;
        }
        return pre;


    }
}
