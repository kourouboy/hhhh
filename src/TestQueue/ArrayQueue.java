package TestQueue;

public class ArrayQueue<E> implements Queue<E> {
    //存放具体的数据
    private  E[] elementData;
    //队列头
    private int head;
    //队列尾部
    private int tail;
    //队列容量
    private int size;

    public ArrayQueue(int size) {
        this.size = size;
        elementData = (E[]) new Object[size];
    }

    @Override
    /**
     * 元素入队
     */
    public void enQueue(E e) {

        if (tail == size){
            System.err.println("队列已满");
            throw new ArrayIndexOutOfBoundsException();
        }
        elementData[tail++] = e;
    }

    @Override
    /**
     * 元素出队
     */
    public E dequeue() {
        if (head == tail){
            System.err.println("队列为空");
            throw new ArrayIndexOutOfBoundsException();
        }
        E result = elementData[head++];
        return result;
    }

    @Override
    /**
     * 返回首元素但不出队
     */
    public E peek() {
        if (head == tail){
            System.err.println("队列为空");
            throw new ArrayIndexOutOfBoundsException();
        }

        E result = elementData[head];
        return result;
    }

    @Override
    public int getSize() {
        return tail - head;
    }

    @Override
    public boolean isEmply() {
        return tail == tail;
    }
}
