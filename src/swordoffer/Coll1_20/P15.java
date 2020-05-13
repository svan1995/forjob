package swordoffer.Coll1_20;

import swordoffer.ListNode;

/**
 * 反转链表
 */
public class P15 {
//    public ListNode ReverseList(ListNode head){
//        ListNode thisNode = head;
//        if (thisNode == null)
//            return null;
//        ListNode nextNode = thisNode.next;
//        thisNode.next = null;
//        while (nextNode != null){
//            ListNode temp = nextNode.next;
//            nextNode.next = thisNode;
//            thisNode = nextNode;
//            nextNode = temp;
//        }
//        return thisNode;
//    }
    //递归法
    public ListNode ReverseList(ListNode head){
        if (head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }
        ListNode p = ReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
