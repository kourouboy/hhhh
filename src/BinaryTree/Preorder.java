package BinaryTree;

/**
 * 二叉树的前序遍历；
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Preorder{
    List<Integer> list = new ArrayList<>();
    public List<Integer> Preorder(TreeNode root){
        if (root == null)
            return Collections.EMPTY_LIST;
        list.add(root.val);
        Preorder(root.left);
        Preorder(root.right);
        return list;
    }

    public static void main(String[] args) {

    }
}
