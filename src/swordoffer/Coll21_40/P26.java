package swordoffer.Coll21_40;

import swordoffer.TreeNode;

import java.util.ArrayList;
import java.util.List;
/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */

public class P26 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        midTree(pRootOfTree, list);
        if(list.isEmpty()) {
            return null;
        }
        for(int i=0;i<list.size()-1;i++) {
            list.get(i).right = list.get(i+1);
            list.get(i+1).left = list.get(i);
        }
        list.get(0).left = null;
        list.get(list.size()-1).right = null;
        return list.get(0);
    }

    private void midTree(TreeNode pRootOfTree, List<TreeNode> list) {
        if(pRootOfTree == null) {
            return ;
        }
        midTree(pRootOfTree.left, list);
        list.add(pRootOfTree);
        midTree(pRootOfTree.right, list);
    }
}
