package TestQueue;

public class LinkedQueue<E> implements Queue<E> {

    //节点对象
    private class Node{
        //链表某个节点的实际值
        public E e;
        //链表某个节点的下一个节点
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }
        public Node(E e){
            this(e,null);
        }
        public Node(){
            this(null,null);
        }

        @Override
        public String toString() {
            return  e.toString();
        }
    }
    //链表的头节点和尾节点
    private Node head ,tail;
    @Override
    public void enQueue(E e) {

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