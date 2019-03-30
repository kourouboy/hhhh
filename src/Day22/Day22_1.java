package Day22;
import java.util.Date;
/**
 * 反射三种实例化对象'
 */

public class Day22_1 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> cls = Class.forName("java.util.Date");
        Object obj = cls.newInstance(); //实例化对象，等价于new java.util.Date();
        System.out.println(obj);
    }
}
