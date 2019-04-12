package Day30;

import java.util.Stack;

public class TestStack {

    public static void main(String[] args) {

        Stack<String> strings = new Stack<>();
        strings.push("Java");
        strings.push("C++");
        strings.push("PHP");
        System.out.println("栈中的元素个数"+strings.size());
        System.out.println("观察栈顶元素"+strings.peek());
        System.out.println("出栈"+strings.pop());
        System.out.println("观察栈顶元素"+strings.peek());
        System.out.println("出栈"+strings.pop());
        System.out.println("出栈"+strings.pop());
        //EmptyStackException 空栈异常
//        System.out.println("出栈"+strings.pop());
        //如果不清楚栈中元素个数，判断：
        if(strings.isEmpty()){
            System.out.println("栈空了");
        }else{
            System.out.println("出栈"+strings.pop());
        }

    }
}
