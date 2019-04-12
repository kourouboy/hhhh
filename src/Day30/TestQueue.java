package Day30;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("C");
        queue.add("B");
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        //取完元素，再取就是空值
        System.out.println(queue.poll());
    }
}
