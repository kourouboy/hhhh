package TestStack;

import java.util.Arrays;

public class ArrayStack {
    private String[] items; //数组
    private int maxSize; //存放的最大数量
    private int currentSize; //当前元素的个数

    //初始化数组
    public ArrayStack(int maxSize){
        this.items = new String[maxSize];
        this.maxSize = maxSize;
        this.currentSize = 0;
    }
    //入栈
    public boolean push(String item){
        if(currentSize == maxSize) {
            //判断
            int oldCurrent = maxSize;
            int newCurrent = oldCurrent << 1;
            //栈大小已经超过int的最大值
            if (((newCurrent + 8) - Integer.MAX_VALUE) > 0) {
                return false;
            }
            //数组扩容
            maxSize = newCurrent;
            items = Arrays.copyOf(items, newCurrent);

        }
            items[currentSize] = item;
            ++currentSize;

        return true;
    }
    //出栈
    public String pop(){
       if(currentSize == 0){
           System.out.println("栈为空");
           return null;
       }else{
           String temp = items[currentSize-1];
           --currentSize;
           return temp;
       }
    }
    public int getSize(){
        return this.currentSize;
    }
    public static void main(String[] args) {

        ArrayStack arrayStack = new ArrayStack(4);
        arrayStack.push("1");
        arrayStack.push("2");
        arrayStack.push("3");
        arrayStack.push("4");
        arrayStack.push("5");
        System.out.println(arrayStack.getSize());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.getSize());
        System.out.println(arrayStack.pop());
    }
}
