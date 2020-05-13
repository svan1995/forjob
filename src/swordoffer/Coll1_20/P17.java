package swordoffer.Coll1_20;

import swordoffer.TreeNode;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class P17 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean flag = false;
        if(root1!=null && root2 != null) {
            if(root1.val == root2.val) {
                flag = equalTree(root1, root2);
            }
            if(!flag) {
                flag = HasSubtree(root1.left, root2);
            }
            if(!flag) {
                flag = HasSubtree(root1.right, root2);
            }
        }
        return flag;
    }

    private boolean equalTree(TreeNode t1, TreeNode t2) {
        if(t2 == null) {
            return true;
        }
        else if((t1==null) ) {
            return false;
        }
        else {
            if(t1.val == t2.val) {
                return equalTree(t1.left, t2.left) && equalTree(t1.right, t2.right);
            }
            return false;
        }
    }
}
