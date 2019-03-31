package Day17;

/**
 * 方法引用————引用静态方法
 */
//@FunctionalInterface
//interface IUtil<P,R>{
//    public R switchPara(P p);
//}
//public class Day17_1 {
//    public static void main(String[] args) {
//        IUtil<Integer,String> iu = String :: valueOf;
//        String str = iu.switchPara(1000);
//        System.out.println(str.length());
//    }
//}

/**
 * 引用对象方法
 * @param <p>
 */
//@FunctionalInterface
//interface Iutil<p>{
//    public  p switchPara();
//}
//public class Day17_1{
//    public static void main(String[] args) {
//        Iutil<String> iu = "bit" :: toUpperCase;
//        System.out.println(iu.switchPara());
//    }
//}

/**
 * 引用类中普通方法
  * @param <R>
 * @param <P>
 */
//interface IUtil<R,P>{
//    public R compare(P p1,P p2);
//}
//public class Day17_1{
//    public static void main(String[] args) {
//        IUtil<Integer,String> iu = String :: compareTo;
//        System.out.println(iu.compare("10","20"));
//    }
//}

import java.util.PrimitiveIterator;

/**
 * 引用构造方法

 */

class Person{
    private String name ;
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
interface IUtil<P,Q,R>{
    public P creatPerson(Q q,R r);
}
public  class Day17_1{
    public static void main(String[] args) {
        IUtil<Person,String,Integer> iu = Person :: new;
        System.out.println(iu.creatPerson("tianxin",10));
    }
}