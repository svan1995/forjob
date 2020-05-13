package swordoffer.Coll21_40;

import swordoffer.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class P36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();

        List<Integer> list = new ArrayList<>();
        while (pHead1!=null){
            stack1.push(pHead1);
            pHead1 = pHead1.next;
        }

        while (pHead2!=null){
            stack2.push(pHead2);
            pHead2 = pHead2.next;
        }

        ListNode tmp = null;
        while (!stack1.isEmpty() && !stack2.isEmpty()){
           if(stack1.peek() == stack2.peek()){
               tmp = stack1.pop();
               stack2.pop();
           }
           else {
               break;
           }
        }
        return tmp;

    }
}
