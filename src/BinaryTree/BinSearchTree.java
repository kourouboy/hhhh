package BinaryTree;

import TestQueue.LinkedQueue;
import TestQueue.Queue;

import java.util.LinkedList;
import java.util.Stack;

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
        if (root == null){
            Node node = new Node(e);
            root = node;
            size++;
        }
        //根据值遍历子树
        add(root,e);
    }
    private void add(Node root ,E e){
        //终止条件
        if (e.equals(root.data)){
            return;
        }else if (e.compareTo(root.data) < 0 && root.left == null){
            Node node = new Node(e);
            node.left = node;
            size++;
        }else if (e.compareTo(root.data) > 0 && root.right == null) {
            Node node = new Node(e);
            node.right = node;
            size++;
        }
        //左子树递归
        if (e.compareTo(root.data) < 0){
            add(root.left,e);
        }
        //右子树递归
        if (e.compareTo(root.data) > 0){
            add(root.right,e);
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    /**
     * 内部方法，根据值递归检测当前二叉树是否包含指定元素
     * @param e
     * @return
     */
    @Override
    public boolean contains(E e) {
        return contains(root,e);
    }
    private boolean contains(Node root,E e){
        //终止条件
        if (root == null){
            return false;
        }
        if (e.equals(root.data)){
            return true;
            //左子树递归
        }else if (e.compareTo(root.data) < 0){
            return contains(root.left,e);
        }else {
            return contains(root.right,e);
        }
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

    /**
     * 前序遍历非递归版本
     */
    public void preOrderNR(){
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node node = stack.pop();
            System.out.println(node.data);
            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }
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

    /**
     * 基于队列实现的二分搜索树层序遍历
     */
    @Override
    public void levelOrder() {
    }

    @Override
    public E getmin() {
        if (root == null)
            System.out.println("Empty");;
        Node node = getMinNode(root);
        return node.data;
    }
    private Node getMinNode(Node node){
        if (node.left == null){
            return node;
        }else {
            return getMinNode(node.left);
        }
    }

    @Override
    public E getmax() {
        if (root == null)
            System.out.println("Empty");
        Node node = getMaxNode(root);
        return node.data;
    }
    private Node getMaxNode(Node node){
        if (node.right == null)
            return node;
        return getMaxNode(node.right);
    }

    @Override
    public E removeMin() {
        return null;
    }

    /**
     * 删除二叉树的最小值节点
     * @param node
     * @return  返回删除后二叉树的根节点
     */
    private Node removeMinNode(Node node){
        //找到要删除的节点
        if (node.left == null){
            Node rigthNode = node.right;
            node.right = null;
            size--;
            return rigthNode;
        }
        //向左一直走，直到找到最小值节点
        node.left = removeMinNode(node.left);
        return node;
    }

    @Override
    public E removeMax() {
        return null;
    }
    private Node removeMaxNode(Node node){
        if (node.right == null){
            Node leftNode = node.left;
            node.left = null;
            size--;
            return leftNode;
        }
        node.right = removeMaxNode(node.right);
        return node;
    }

    @Override
    public boolean remove(E e) {
        return false;
    }

    /**
     * 删除以node为根节点且值为e的节点
     * @param node
     * @param e
     * @return 删除后的二叉树根节点
     */
    private Node remove(Node node,E e){
        if (node == null)
            return null;
        if (e.compareTo(node.data) < 0){
            node.left= remove(node.left,e);
        }
        if (e.compareTo(node.data) > 0){
            node.right = remove(node.right,e);
        }
        //此时node就为需要删除的节点
        else {
            if (node.left != null && node.right == null){
                Node leftNode = node.left;
                size--;
                node.left = null;
                return leftNode;
            }
            if (node.right != null && node.left == null){
                Node rightNode = node.right;
                size--;
                node.left = null;
                return rightNode;
            }
            if (node.left != null && node.right != null){
                //找到前驱后继节点
                Node successor = getMinNode(node.right);
                successor.left = node.left;
                successor.right = removeMinNode(node.right);
                node.right = node.left = null;
                return successor;
            }
        }
        return node;
    }
}
