package Day29;

import java.util.Hashtable;

public class TestHashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(1,"java");
        hashtable.put(2,"C++");
        hashtable.put(3,"PHP");
        System.out.println(hashtable);
    }
}
