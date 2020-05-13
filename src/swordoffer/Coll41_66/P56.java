package swordoffer.Coll41_66;

import swordoffer.ListNode;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class P56 {
    public ListNode deleteDuplication(ListNode pHead)
    {
        ListNode thisNode = pHead;
        ListNode preNode = null;
        while (thisNode != null){
            int value = thisNode.val;
            if (thisNode.next != null){
                if(thisNode.next.val != value){
                    if(preNode == null){
                        preNode = thisNode;
                        pHead = preNode;
                    }else {
                        preNode = thisNode;
                    }

                    thisNode = thisNode.next;
                }
                else{
                    while (thisNode != null){
                        if(thisNode.val == value){
                            thisNode = thisNode.next;
                        }else {
                            if(preNode != null){
                                preNode.next = thisNode;
                            }
                            break;
                        }
                    }if(thisNode == null){
                        if(preNode == null){
                            return null;
                        }else {
                            preNode.next = null;
                            return pHead;
                        }
                    }
                }
            }
            else {
                if(preNode == null){
                    preNode = thisNode;
                    pHead = preNode;
                }
                thisNode = thisNode.next;
            }

        }


        return pHead;
    }
}
