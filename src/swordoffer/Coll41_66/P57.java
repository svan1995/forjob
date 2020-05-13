package swordoffer.Coll41_66;

import swordoffer.TreeLinkNode;

/**
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */

public class P57 {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode.right == null){
            TreeLinkNode parent;
            if(pNode.next != null){
                parent = pNode.next;
                    if(parent.left == pNode){
                        return parent;
                    }else {
                        while (parent.next != null){
                            if(parent.next.left == parent){
                                return parent.next;
                            }else {
                                parent = parent.next;
                            }
                        }
                        return null;
                    }
            }
            else {
                return null;
            }

        }
        else {
            TreeLinkNode rightNode = pNode.right;
            while (rightNode.left != null){
                rightNode = rightNode.left;
            }
            return rightNode;
        }
    }
}
