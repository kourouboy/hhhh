package Day23;
import java.lang.reflect.Field;

/**
 * 动态设置封装打破封装
 */
class  Person4{
    private String name;
        }
public class Day23_4{
    public static void main(String[] args) throws Exception {
        Class<?> cls =Person4.class;
        //通过反射操作属性
        //实例化本类对象
        Object obj = cls.newInstance();
        //操作school属性
        Field nameField = cls.getDeclaredField("name");
        //取消封装
        nameField.setAccessible(true);//!!!!!!!!!!!!!!!!!!!!!!
        //---------------------------
        nameField.set(obj,"tianxin");
        System.out.println(nameField.get(obj));
    }
}