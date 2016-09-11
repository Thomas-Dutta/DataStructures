package main.java.com.thomas.www.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by thomasdutta on 9/10/16.
 */
public class BinaryTreePostOrderTraversal {
    public List<Integer> postOrderTraversal(TreeNode<Integer> root) {
        List<Integer> list  = new ArrayList<Integer>();

        if(root == null) {
            return list;
        }

        TreeNode<Integer> current = root;
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || current!=null) {
            if(current!=null) {
                if(current.getRight()!=null) {
                    stack.push(current.getRight());
                }
                stack.push(current);
                current = current.getLeft();

            } else {
                TreeNode<Integer> node = stack.pop();
                if(!stack.isEmpty() && (node.getRight() == stack.peek())) {
                    current = stack.pop();
                    stack.push(node);
                } else {
                    list.add(node.getData());
                    current = null;
                }

            }
        }

        return list;
    }
}
