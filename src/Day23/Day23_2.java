package Day23;

import java.lang.reflect.Method;

/**
 * 反射调用普通方法
 */
class Person1{
    private String name;
    private int age;
    public Person1(){};
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }
}
public class Day23_2 {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Person1.class;
//        //取得全部普通方法
//        Method[] methods = cls.getMethods();
//        for(Method m : methods){
//            System.out.println(m);
//        }
       //Class<?> cls = Class.forName("Day23.Person1");
        //任何时候调用类中的普通方法都必须有实例化对象
        Object obj = cls.newInstance();
        //取得setname这个方法的实例化对象，设置方法名称与参数对象
        Method setMethod = cls.getMethod("setName",String.class);
        //随后需要通过Method类对象调用指定的方法，调用方法需要有实例化对象，同时传参
        setMethod.invoke(obj,"tianxin");//相当于person对象.setName（"tianxin"）
        Method getMethod = cls.getMethod("getName");
        Object result = getMethod.invoke(obj);
        System.out.println(result);
    }
}
