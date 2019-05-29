package BinaryTree;

public class BinSearchTree<E extends Comparable> implements BinTree<E> {
    private class Node {
        E data;
        Node left;
        Node right;

        public Node(E data) {
            this.data = data;
        }
    }
    @Override
    public void add(E e) {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public void preOrder() {

    }

    @Override
    public void inOrder() {

    }

    @Override
    public void postOrder() {

    }

    @Override
    public void levelOrder() {

    }

    @Override
    public E getmin() {
        return null;
    }

    @Override
    public E getmax() {
        return null;
    }

    @Override
    public E removeMin() {
        return null;
    }

    @Override
    public E removeMax() {
        return null;
    }

    @Override
    public boolean remove(E e) {
        return false;
    }
}
