package swordoffer.Coll41_66;

import swordoffer.TreeNode;

/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 */
public class P62 {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if( k==0 || pRoot == null){
            return null;
        }

        int leftNum = NumOfNode(pRoot.left);
        int rightNum = NumOfNode(pRoot.right);
        int totalNum = leftNum + rightNum + 1;
        if(k == leftNum +1){
            return pRoot;
        }
        else if (k < leftNum + 1){
            return KthNode(pRoot.left, k);
        }
        else {
            return KthNode(pRoot.right, k-(leftNum+1));
        }
    }

    private int NumOfNode(TreeNode pRoot){
        if(pRoot == null){
            return 0;
        }
        else{
            return 1 + NumOfNode(pRoot.left) + NumOfNode(pRoot.right);
        }
    }
}
