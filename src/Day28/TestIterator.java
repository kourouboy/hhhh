package Day28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代输出
 */
public class TestIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello");
        list.add("bit");
        list.add("Java");
        list.add("java");
        list.remove("hello");
        Iterator<String>iterator = list.iterator();//实例化Iterator 对象
        while(iterator.hasNext()){
            String str = iterator.next();
            if (str.equals("hello")){
                //使用集合提供的remove方法，则会产生异常ConcurrentModificationException

//                list.remove("hello");//错误方法

                //Iterator则不会产生异常
                iterator.remove();
                continue;
            }
            System.out.println(str);

        }
    }
}
