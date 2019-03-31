package Day1;

import org.omg.CORBA.PERSIST_STORE;
import org.omg.CORBA.PRIVATE_MEMBER;

import javax.xml.transform.Result;

public class SequenceLinkedImpl implements Sequence {
    //虚拟头节点，不储存元素，专门作为头节点使用。
    private  Node dummyHead;
    private int size;

    public SequenceLinkedImpl() {
        dummyHead = new Node(null,null);
    }

    private class Node{
        Object data;
        Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
        public Node(Object data) {
            this.data = data;
        }
    }
    @Override
    public void add(Object data) {
        //尾插
        addLast(data);
    }

    @Override
    public boolean remove(int index) {
        rangecheck(index);
        Node pre = dummyHead;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        //取得当前结点
        Node cur = node(index);
        pre.next = cur.next;
        //清空当前结点
        cur.next = cur = null;
        size--;
        return true;
    }

    @Override
    public Object get(int index) {
        rangecheck(index);
        //取得相应的index的Node结点
        Node node = node (index);
        return node.next;
    }

    @Override
    public boolean contains(Object data) {
        Object[] datas = toArray();
        if(data == null){
            for (int i = 0; i < datas.length; i++) {
                if(datas[i] == null) {
                    return true;
                    }
                }
            }else {
                for (int i = 0; i < datas.length; i++) {
                    if(datas.equals(datas[i])){
                        return true;
                    }
                }
            }
        return false;
    }

    @Override
    public Object set(int index, Object newData) {
         rangecheck(index);
         //取得index相应的node结点；
         Node node = node(index);
         Object oldData = node.data;
         node.data = newData;
         return oldData;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        for(Node temp = dummyHead.next;temp != null;){
            temp.data = null;
            Node node = temp.next;
            temp.next = null;
            temp = node;
            size--;
        }
    }

    @Override
    public Object[] toArray() {
        Object[] results = new Object[size];//创建一个长度为size的数组；
        int i = 0;
        for (Node temp = dummyHead.next;temp != null;temp = temp.next){
            results[i++] = temp.data;
        }
        return results;
    }
    //在指定结点位置插入新结点；
    public void add(int index,Object data){
        Node pre = dummyHead;
        for (int i = 0; i <index ; i++) {
            pre = pre.next;
        }
        pre.next = new Node(data,pre.next);
        size++;
    }
    //头插
    private void addFirst(Object data){
        add (0,data);
    }
    //尾插
    private void addLast(Object data){
        add(size,data);
    }
    //检测索引是否合法
    private void rangecheck(int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("索引非法,请重新输入");
        }
    }
    //取得指定索引结点：
    private Node node (int index){
        rangecheck(index);
        Node temp = dummyHead.next;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
}

