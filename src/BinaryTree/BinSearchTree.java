package BinaryTree;

import TestQueue.LinkedQueue;
import TestQueue.Queue;

import java.util.LinkedList;

public class BinSearchTree<E extends Comparable> implements BinTree<E> {
    private class Node {
        E data;
        Node left;
        Node right;

        public Node(E data) {
            this.data = data;
        }
    }
    private Node root;
    private int size;
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
        postOrder(root);
    }
    private void preOrder(Node node){
        //终止条件
        if (node == null)
            return;
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);

    }

    @Override
    public void inOrder() {
        inOrder(root);
    }
    private void inOrder(Node node){
        if (node == null)
            return;
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }

    @Override
    public void postOrder() {
        postOrder(root);
    }
    private void postOrder(Node node){
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
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
