package BinaryTree;

/**
 * 二叉树的后序遍历；
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TreeNode3{
    int val;
    TreeNode3 left;
    TreeNode3 right;

    public TreeNode3(int val) {
        this.val = val;
    }
}
public class Postorder {
    List<Integer> list = new ArrayList<>();
    public List<Integer> Preorder(TreeNode root){
        if (root == null)
            return Collections.EMPTY_LIST;
        Preorder(root.left);
        Preorder(root.right);
        list.add(root.val);
        return list;
    }
}
