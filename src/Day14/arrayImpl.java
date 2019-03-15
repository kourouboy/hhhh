package Day14;

import java.security.interfaces.ECKey;

/**
 * 基于数组实现线性表
 */
public class arrayImpl implements Sequence {
    //存放元素的对象数组
    private Object[] elementData;
    //默认容量
    private final static int DEFAULT_CAPACITY = 10;
    //存放元素的个数
    private int size;
    //线性表的最大容量
    private  final static int MAX_CAPACITY = Integer.MAX_VALUE - 8;
    public arrayImpl(){
        //初始化存储元素数组，初始化为10；
        this.elementData = new Object[DEFAULT_CAPACITY];
    }
    public arrayImpl(int capacity) {
        if (capacity > 0) {
            this.elementData = new Object[capacity];
        }
    }
    @Override
    public void add(Object data) {
        //判断是否越界
        ensureCapacityInternal(size + 1);
        elementData[size++] = data;
    }

    @Override
    public boolean remove(int index) {
        rangeCheck(index);
        Object oldData = elementData[index];
        int moveSize = size - index - 1;
        if(moveSize > 0){
            System.arraycopy(elementData,index + 1,elementData,index,moveSize);
        }
        //最后一个元素
        elementData[size--] = null;
        return true;
    }

    @Override
    public Object get(int index) {
        rangeCheck(index);
        return elementData[index];
    }

    @Override
    public boolean contains(Object data) {

        //判断是否有指定内容 null 不能用equals，所以得先判断
        if (data == null) {
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                    return true;
                }
            }
        }
        else{
            for (int i = 0; i < size; i++) {
                if (data.equals(elementData[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Object set(int index, Object newData) {
        rangeCheck(index);
        //取得修改前的内容；
        Object oldData = elementData[index];
        elementData[index] = newData;
        return oldData;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        this.size = 0;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }
    private void ensureCapacityInternal(int cap){
        //超过了原来的数组大小
        if (cap - elementData.length > 0 ){
            //扩容策略
            grow(cap);
        }
    }
    private void grow(int cap){
        int oldCap = elementData.length;
        int newCap = oldCap << 1;//扩大两倍
        if(cap - newCap > 0 ){
            newCap = cap;
        }
        if(newCap - MAX_CAPACITY > 0){
            throw new IndexOutOfBoundsException("超过线性表最大值");
        }
    }
    private void rangeCheck(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("illega array");
        }
    }
}
