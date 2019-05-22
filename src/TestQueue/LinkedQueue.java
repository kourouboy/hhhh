package TestQueue;

public class LinkedQueue<E> implements Queue<E>{

    private ListNode head;
    private ListNode tail;
    private static int size;
    private class ListNode{

        E data;
        ListNode node;

        public ListNode(E data, ListNode node) {
            this.data = data;
            this.node = node;
        }
    }

    @Override
    public void enQueue(E e) {

        ListNode listNode = new ListNode(e,null);
        if ()
    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmply() {
        return false;
    }
}
