package swordoffer.Coll41_66;

import swordoffer.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 请实现一个函数按照之字形打印二叉树，
 * 即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */

public class P59 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> layer = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result= new ArrayList<>();
        if (pRoot == null){
            return result;
        }
        int layerNum = 1;
        int thisNum = 0;
        int flag = 1;
        queue.add(pRoot);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();
            thisNum++;
            layer.add(node.val);

            if(node.left != null){
                queue.add(node.left);
            }
            if (node.right != null){
                queue.add(node.right);
            }


            if(thisNum == layerNum){
                if(flag < 0){
                    Collections.reverse(layer);
                }
                flag = -flag;
                result.add(layer);
                thisNum = 0;
                layerNum = queue.size();
                layer = new ArrayList<>();
            }
        }
        return result;
    }
}
