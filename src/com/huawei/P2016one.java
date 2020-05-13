package com.huawei;

import java.util.Scanner;

public class P2016one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            if(n >1000){
                n = 1000;
            }
            LinkNode head = new LinkNode(0) ;
            LinkNode pre = head;
            if(n==0){
                throw new RuntimeException("zero");
            }
            if(n==1){
                System.out.println(0);
                return;
            }
            for(int i=1; i<n; i++){
                LinkNode node = new LinkNode(i);
                pre.next = node;
                pre = pre.next;
            }
            pre.next = head;
            LinkNode node = head;
            while (node.next.next != node){
                LinkNode preNode = node.next;
                LinkNode thisNode = node.next.next;
                LinkNode after = thisNode.next;
                preNode.next = after;
                node = after;
            }
            System.out.println(node.next.val);
        }



        scanner.close();
    }
}

class LinkNode{
    int val;
    LinkNode next;

    public LinkNode(int val) {
        this.val = val;
    }


}

