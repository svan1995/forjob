package swordoffer.Coll1_20;

import swordoffer.TreeNode;


/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */

public class P4 {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        if (pre.length == 0){
            return null;
        }
        if (pre.length == 1){
            return new TreeNode(pre[0]);
        }
        TreeNode root = new TreeNode(pre[0]);
        int length = pre.length;
        int i;
        for (i=0; i<length;i++){
            if (in[i] == pre[0])
                break;
        }
        int left_length = i;
        int right_length = length - i -1;
        int[] pre_left = new int[left_length];
        int[] in_left = new int[left_length];
        int[] pre_right = new int[right_length];
        int[] in_right = new int[right_length];

        for (int k=0; k<left_length;k++){
            pre_left[k] = pre[k+1];
            in_left[k] = in[k];
        }
        for (int k=0; k<right_length;k++){
            pre_right[k] = pre[i+1+k];
            in_right[k] = in[i+1+k];
        }

        root.left = reConstructBinaryTree(pre_left, in_left);
        root.right = reConstructBinaryTree(pre_right, in_right);
        return  root;

    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        new P4().reConstructBinaryTree(pre,in);
    }


}
