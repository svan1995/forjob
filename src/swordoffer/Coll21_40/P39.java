package swordoffer.Coll21_40;

import swordoffer.TreeNode;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class P39 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }else {
            return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
        }
    }

    private int height(TreeNode root){
        if(root == null){
            return 0;
        }
        else {
            return 1 + (height(root.left) > height(root.right) ? height(root.left) : height(root.right));
        }
    }
}
