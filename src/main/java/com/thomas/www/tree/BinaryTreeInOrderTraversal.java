package main.java.com.thomas.www.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by thomasdutta on 9/10/16.
 */
public class BinaryTreeInOrderTraversal {

    public List<Integer> inorderTraversal(TreeNode<Integer> root) {
        List<Integer> list =  new ArrayList<Integer>();

        if(root == null) {
            return list;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode<Integer> current =  root;

        while(current!=null || !stack.isEmpty()) {
            if(current!=null) {
                stack.push(current);
                current = current.getLeft();
            }
            else {
                TreeNode<Integer> node  = stack.pop();
                list.add(node.getData());
                current = node.getRight();
            }

        }

        return list;
    }
}
