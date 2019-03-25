package Day19;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射调用构造
 */
//class Person{
//    public Person(){}
//    public Person(String name ){}
//    public Person(String name ,int age){}
//}
//public class Day19_1 {
//    public static void main(String[] args) {
//        Class<Day19_1> cls = Day19_1.class;//Class <?> cls = Person.class;
//        //取得类中全部构造
//        Constructor<?>[] con = cls.getConstructors();
//        for(Constructor<?> constructor : con){
//            System.out.println(constructor);
//        }
//    }
//}

//写简单的Java类要写无参构造

//class Person{
//    private String name ;
//    private int age ;
//    //Class类通过反射实例化对象的时候，只能够调用类中的无参构造。如果类中没有无参构造则无法使用Class类调用，只能够
//    //通过明确的构造调用实例化处理
//    public Person(){}
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}
//public class Day19_1{
//    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
//        Class<?> cls = Person.class;
//        System.out.println(cls.newInstance());
//    }
//}
/**
 * 通过constructo类实例化对象
 */

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Day19_1{
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        Class<?> cls = Person.class;
        //取得指定参数类型的构造方法对象
        Constructor<?> cons = cls.getConstructor(String.class,int.class);
        System.out.println(cons.newInstance("lili",22));
    }
}