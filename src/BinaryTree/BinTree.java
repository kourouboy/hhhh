package BinaryTree;

public interface BinTree<E> {
    /**
     * 向二叉树中添加元素
     * @param e
     */
    void add(E e);

    /**
     * 取得二叉树节点个数
     * @return
     */
    int getSize();

    /**
     * 查找是否含有指定元素
     * @param e
     * @return
     */
    boolean contains(E e);

    /**
     * 二叉树的前序遍历
     */
    void preOrder();

    /**
     * 二叉树中序遍历
     */
    void inOrder();
    /**
     * 二叉树后序遍历
     */
    void postOrder();
    /**
     * 层序遍历
     */
    void levelOrder();
    /**
     * 取得二叉树的最小值节点
     */
    E getmin();
    /**
     * 取得二叉树的最大值节点
     */
    E getmax();
    E removeMin();
    E removeMax();
    boolean remove(E e);
}
