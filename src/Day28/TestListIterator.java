package Day28;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *双向迭代接口
 */
public class TestListIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("E");
        list.add("D");
        list.add("C");
        list.add("B");
        ListIterator<String> listIteator = list.listIterator();
        System.out.println("从前向后输出：");//无序输出
        while(listIteator.hasNext()){
            System.out.print(listIteator.next() + "、");
        }
        System.out.println("\n");
        System.out.println("从后向前输出");
        while(listIteator.hasPrevious()){
            System.out.print(listIteator.previous() + "、");
        }
    }
}
//如果想要实现从后向前输出，应该首先进行从前向后输出，否则无法实现双向