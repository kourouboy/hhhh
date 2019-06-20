package BinaryTree;
/**
 * 二叉树的中序遍历
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Collections;

class TreeNode1{
    int val;
    TreeNode1 left;
    TreeNode1 right;

    public TreeNode1(int val) {
        this.val = val;
    }
}
//1.栈实现
public class inorder {
    public List<Integer> inorder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }
        return list;
    }
    //2.指定根节点root，遍历用list集合实现：
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return Collections.emptyList();
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;

    }
}
