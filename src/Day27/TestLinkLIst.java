package Day27;

import java.util.LinkedList;
import java.util.List;

public class TestLinkLIst {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("hello");
        list.add("Java");
        list.add("hello");
        list.add("bit");
        System.out.println(list);
        list.remove("hello");
        System.out.println(list);
    }
}

//问题： 解释ArraysList与LinkedList的区别？
// A：封装的是数组 L：封装的是链表。
// 时间复杂度：A：1  L：n。