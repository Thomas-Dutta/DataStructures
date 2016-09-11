package main.java.com.thomas.www.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by thomasdutta on 9/10/16.
 */
public class BinaryTreePreOrderTraversal {
    public List<Integer> preOrderTraversal (TreeNode<Integer> root) {

        List<Integer> list = new ArrayList<>();

        if(root == null) {
            return null;
        }

        getPreOrderTraversalRecursive(root, list);
        return list;
    }

    private void getPreOrderTraversalRecursive(TreeNode<Integer> root, List<Integer> list) {
        if(root == null) {
            return;
        }
        list.add(root.getData());
        getPreOrderTraversalRecursive(root.getLeft(), list);
        getPreOrderTraversalRecursive(root.getRight(), list);

    }

    public List<Integer> preOrderTraversalIterative(TreeNode<Integer> root) {
        List<Integer> list  = new ArrayList<Integer> ();
        if(root == null) {
            return list;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode<Integer> node = stack.pop();
            list.add(node.getData());

            if (node.getRight() != null) {
                stack.push(node.getRight());
            }

            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }
        }

        return list;
    }
}
