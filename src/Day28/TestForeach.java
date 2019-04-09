package Day28;

import java.util.ArrayList;
import java.util.List;

public class TestForeach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        for(Integer integer : list){
            System.out.println(integer);
        }
    }
}
//小节：看见集合输出就用Iterator 。
//   掌握好Iterator和Enumeration中的方法
