package Day27;

import java.util.List;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("hello");
        list.add("hello");
        list.add("bit");
        System.out.println(list);
        list.remove("hello");
        System.out.println(list);
    }
}

//问题？  ArraysList和Vector的区别？
//历史时间：A：JDK1.2提供；V：JDK1.0提供。
//处理形式：A：异步处理，性能更高；V：同步处理，性能低。
//数据安全：A：非线程安全；V;性能安全。
//输出形式：A：支持lterator、Listlterator、foreach；V：支持lterator、Listlterator、foreach、Enumeration.
