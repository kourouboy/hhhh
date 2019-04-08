package Day27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.size()+"、"+list.isEmpty());
        //list可以重复数据
        list.add("hello");
        list.add("hello");
        list.add("bit");
        System.out.println(list.size()+"、"+list.isEmpty());
        System.out.println(list);
        System.out.println(list.remove("hello"));
        System.out.println(list.contains("java"));
        System.out.println(list.contains("bit"));
        System.out.println(list);
        //get()方法时List接口提供的，如果是collection，次数数据的去除只能将集合变为对象数组操作
        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }
        //collection 进行输出处理
        //以object为主，可能需要向下转型，产生ClassCastException
        Object[] rs = list.toArray();
        System.out.println(Arrays.toString(rs));
    }
}


