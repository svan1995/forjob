package swordoffer.Coll41_66;

import swordoffer.TreeNode;


/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class P58 {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null){
            return true;
        }
        return isSymmetrialNode(pRoot.left, pRoot.right);
    }

    private boolean isSymmetrialNode(TreeNode leftNode, TreeNode rightNode) {
        if(leftNode == null && rightNode == null){
            return true;
        }
        if((leftNode == null && rightNode != null) || (leftNode != null && rightNode == null)){
            return false;
        }
        if(leftNode.val != rightNode.val){
            return false;
        }
        return isSymmetrialNode(leftNode.left, rightNode.right) && isSymmetrialNode(leftNode.right, rightNode.left);
    }
}
