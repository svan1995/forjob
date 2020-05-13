package swordoffer.Coll41_66;

import swordoffer.ListNode;

import java.util.HashSet;

public class P55 {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        HashSet<ListNode> set = new HashSet<>();
        while (pHead != null){
            if(set.contains(pHead)){
                return pHead;
            }
            set.add(pHead);
            pHead = pHead.next;
        }
        return null;
    }

}
