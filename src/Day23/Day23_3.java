package Day23;

import java.lang.reflect.Field;

/**
 * 反射调用类中属性
 */
class  Person3{
    public String name;
    public int age;
}
class Student extends Person3{
    private String school;
}
public class Day23_3 {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Person3.class;
        {
            //取得类中全部属性1
            Field[] fields = cls.getFields();
            for(Field field : fields){
                System.out.println(field);
            }
        }
        System.out.println("---------------------");
        {
            //取得类中全部属性2
            Field[] fields = cls.getDeclaredFields();
            for(Field field : fields){
                System.out.println(field);
            }
        }
    }
}