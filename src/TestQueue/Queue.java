package TestQueue;

public interface Queue<E>{
    /**
     * 元素入队列
     * @param e 要插入的元素
     */
    void enQueue(E e);

    /**
     * 返回队首元素并且出队
     * @return
     */
    E dequeue();

    /**
     * 返回队首元素但不出队
     * @return
     */
    E peek();
    int getSize();
    boolean isEmply();
}
