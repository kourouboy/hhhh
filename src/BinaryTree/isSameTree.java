package BinaryTree;

/**
 * 相同的树
 */
 class TreeNode4{
      int val;
      TreeNode4 left;
      TreeNode4 right;
      TreeNode4(int x) { val = x; }
  }

public class isSameTree {
    public boolean isSameTree(TreeNode4 p, TreeNode4 q) {
        if(p == null && q == null){
            return true;
        }
        if(p != null && q != null && p.val == q.val){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }else{
            return false;
        }
    }
}