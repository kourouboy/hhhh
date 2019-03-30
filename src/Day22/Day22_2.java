package Day22;

/**
 * 反射与类操作
 */
interface Fruit{};
interface Message{};
class CLS implements Fruit,Message{}
public class Day22_2 {
    public static void main(String[] args) {
        Class<Day22_2> cls = Day22_2.class;//Class<?> cls = CLS.class;
        //取得Package名称
        System.out.println(cls.getPackage().getName());
        //取得父类名称
        System.out.println(cls.getSuperclass().getName());
        //取得实现父类接口对象
        Class<?>[] iclass = cls.getInterfaces();
        for(Class<?> clss : iclass){
            System.out.println(clss.getName());
        }
    }
}
