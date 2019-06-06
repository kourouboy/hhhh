package Heap;

import java.util.Comparator;

public class Heap<E> {
    //用来存放元素的数组
    private E[] ellmentData;
    private int size;
    private Comparator<E> comparator;

    private static final Integer DEAFAULT_SIZE = 10;

    public Heap() {
        this(DEAFAULT_SIZE,null);
    }
    public Heap(int initialCa)

    public Heap( int size, Comparator<E> comparator) {
        this.size = size;
        this.comparator = comparator;
    }
    public void  add(E e){

    }
    public int getSize{

    }
    /**
     * 调整当前节点在堆中的位置
     * @param index
     */
    private void siftUp(int index){

    }

    public E extracMax(){
        E result = findMax();
        //
        swap(0,size - 1);
        elementData[--size]  = null;

        return result;
    }
    private void siftDown(int index){
        while (leftChildIndex(index) < size){
            //当前孩子左下标
            int j = leftChildIndex(index);
            //判断是左孩子还是右孩子
            if (j + 1 < size){
                //此时右孩子
                if (compara(elementData[j],elementData[j + 1]) < 0){
                    //j指向右孩子索引下标
                    j++;
                }
                if (compara(elementData[j],elementData[j + 1]) > 0){
                    break;

                }
            }
        }
    }
}
