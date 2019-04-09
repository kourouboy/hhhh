package Day28;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 枚举输出
 */
public class TestEnumeration {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("PHP");
        vector.add("C++");
        vector.add("python");
        Enumeration<String> enumeration =vector.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}

//在一些操作类库上依然只支持Enumeration，而不支持Iterator。