package Day27;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestHash_TreeSet {
    public static void main(String[] args) {
        //HashSet
//        Set<String> set = new HashSet<>();
//        set.add("hello");
//        set.add("Java");
//        set.add("hello");
//        set.add("bit");
//        System.out.println(set);


        //TreeSet  升序排列的模式，也不能重复
        Set<String> set = new TreeSet<>();
        set.add("c");
        set.add("c");
        set.add("d");
        set.add("a");
        set.add("b");
        System.out.println(set);

    }
}
