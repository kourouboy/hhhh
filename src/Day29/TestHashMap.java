package Day29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(1,"A");
        map.put(3,"C");
        map.put(2,"B");

//        System.out.println(map);
//
//        System.out.println(map.get(2));
//
//        System.out.println(map.get(8));
        //取得map中所有key的信息    输出是有序的，并且不能重复

        System.out.println(map.keySet());

        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
