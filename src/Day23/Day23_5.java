package Day23;

import java.lang.reflect.Field;

/**
 * 取得属性类型
 */
class Person5{
    private String name;
}
public class Day23_5 {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Person5.class;
        //实例化本类对象
        Object obj = cls.newInstance();
        //操作name属性
        Field nameField = cls.getDeclaredField("name");
        //包，类
        System.out.println(nameField.getType().getName());
        System.out.println(nameField.getType().getSimpleName());

    }
}
