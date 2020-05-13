package swordoffer.Coll41_66;

import swordoffer.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */
public class P60 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> layer = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result= new ArrayList<>();
        if (pRoot == null){
            return result;
        }
        int layerNum = 1;
        int thisNum = 0;
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
                result.add(layer);
                thisNum = 0;
                layerNum = queue.size();
                layer = new ArrayList<>();
            }
        }
        return result;

    }
}
