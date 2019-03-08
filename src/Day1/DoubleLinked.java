package Day1;


/**
 *基于双向链表的线性表
 */
public class DoubleLinked implements Sequence {

    private Node head;
    private Node tail;
    private int size;

    private class Node{
        private Node prev;
        private Object date;//数据
        private Node next;

        public Node(Object date) {
            this.date = date;
        }

        public Node(Node prev, Object date, Node next) {
            this.prev = prev;
            this.date = date;
            this.next = next;
        }
    }
    @Override
    public void add(Object data) {
        //尾插法
        //Node temp = this.tail;
        //产生新的结点，尾插入链表中
        Node newNode = new Node(tail,data,null);
        if(head == null){
            head = newNode;
        }else{
            tail.next= newNode;
        }
        this.tail = newNode;
        this.size++;
    }

    @Override
    public boolean remove(int index) {
        rangeCheck(index);
        //要删除的结点
        Node cur = node(index);
        Node prev = cur.prev;
        Node next = cur.next;
        //要删除的是头节点
        if(cur.prev == null){
            head = cur.next;
        }
        //有前驱结点
        else{
            prev.next = cur.next;
            cur.next = null;
        }
        //删除的是尾结点
        if (next == null){
            tail = cur.prev;
        }else{
            next.prev = cur.prev;
            cur.prev = null;
        }
        size--;
        return false;
    }

    @Override
    public Object get(int index) {
        rangeCheck(index);
        //取得指定位置Node
        return node(index).date;
    }

    @Override
    public boolean contains(Object data) {
        return false;
    }

    @Override
    public Object set(int index, Object newData) {
        rangeCheck(index);
        //取得指定位置Node
        Node node = node(index);
        Object oldData = node.date;
        node.date = newData;
        return oldData;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for(Node temp = head;temp != null;){
            Node next = temp.next;
            temp.prev = temp.next = null;
            temp.date = null;
            temp = next;
            size--;
        }
    }

    @Override
    public Object[] toArray() {
        Object[] data = new Object[size];
        int i = 0;
        for(Node temp = head;temp != null;temp = temp.next){
            data[i++] = temp.date;
        }
        return data;
    }
    private void rangeCheck(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Illegal Index");
        }
    }
    private Node node(int index){
        //如果要查找的结点在中间位置左边；
        if (index < (size >> 1)){
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }else {
            Node temp = tail;
            for (int i = size - 1; i > index; i--) {
                temp = temp.prev;
            }
            return temp;
        }
    }
}
