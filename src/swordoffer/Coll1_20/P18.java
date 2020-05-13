package swordoffer.Coll1_20;

import swordoffer.TreeNode;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class P18 {
    public void Mirror(TreeNode root) {
        if(root==null) {
            return;
        }
        else {
            TreeNode temp;
            temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        Mirror(root.left);
        Mirror(root.right);

    }
}
