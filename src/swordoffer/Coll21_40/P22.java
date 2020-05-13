package swordoffer.Coll21_40;

import swordoffer.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */

public class P22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if(root == null) {
            return arrayList;
        }

        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        queue.addFirst(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.pollFirst();
            arrayList.add(node.val);
            if(node.left != null) {
                queue.add(node.left);
            }
            if(node.right != null) {
                queue.add(node.right);
            }
        }

        return arrayList;
    }
}
