package suanfa.tree;

import javax.print.attribute.standard.NumberUp;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Traversal {
    public void preTraversal(TreeNode root){
        if (root == null){
            return;
        }
        System.out.print(root.val + " ");
        preTraversal(root.left);
        preTraversal(root.right);
    }
    public void midTraversal(TreeNode root){
        if (root == null){
            return;
        }
        midTraversal(root.left);
        System.out.print(root.val + " ");
        midTraversal(root.right);
    }
    public void afterTraversal(TreeNode root){
        if (root == null){
            return;
        }
        afterTraversal(root.left);
        afterTraversal(root.right);
        System.out.print(root.val + " ");
    }

    public void layerTraversal(TreeNode root){
        if (root == null){
            return;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.removeFirst();
            System.out.print(node.val + " ");
            if (node.left != null){
                queue.addLast(node.left);
            }
            if (node.right != null){
                queue.addLast(node.right);
            }
        }

    }

    public void preTraversal2(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()){
            while (root != null){
                System.out.print(root.val + " ");
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
    }

    public void midTraversal2(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            System.out.print(root.val + " ");
            root = root.right;
        }
    }

    public void afterTraversal2(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode preNode = null;
        while(root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }

            TreeNode thisNode = stack.pop();
            if (thisNode.right == null || thisNode.right == preNode){
                System.out.print(thisNode.val + " ");
                preNode = thisNode;
            }
            else {
                stack.push(thisNode);
                root = thisNode.right;
            }

        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.setVal(1);
        TreeNode node1 = new TreeNode();
        node1.setVal(2);
        TreeNode node2 = new TreeNode();
        node2.setVal(3);
        root.setLeft(node1);
        root.setRight(node2);
        new Traversal().midTraversal2(root);
        System.out.println();
        new Traversal().preTraversal2(root);
        System.out.println();
        new Traversal().afterTraversal2(root);
    }
}
