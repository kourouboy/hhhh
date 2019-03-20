package Day18;
import jdk.nashorn.internal.ir.IfNode;

import javax.sound.midi.Soundbank;
import java.util.Calendar;
import java.util.Date;
/**
 * 反射
 */

/**
 * 三种实例化对象
 */
//public class Day18_1 {
//    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
////        Date date = new Date();l
////        Class<Date> cls = (Class<Date>) date.getClass();
////        System.out.println(cls);
////        System.out.println(Date.class);
////        Class cls1 = Class.forName("java.util.Date");
////        System.out.println(cls1);
////        Class<Date> cls = Date.class;
////        //通过反射取得Date类对象
////        Date date = cls.newInstance();
////        System.out.println(date);
//    }
//}
/**
 * 反射工厂模式
 */
//interface IFruit{
//    public void eat();
//}
//class Apple implements IFruit{
//    @Override
//    public void eat() {
//        System.out.println("eat an apple");
//    }
//}
//class Watermelon implements IFruit{
//    @Override
//    public void eat() {
//        System.out.println("eat a watermelon");
//    }
//}
//class Factory{
//    private Factory(){}
//    public static IFruit getInstance(String className){
//        IFruit fruit = null;
//        try {
//            fruit = (IFruit) Class.forName(className).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return fruit;
//    }
//}
//public class Day18_1{
//    public static void main(String[] args) {
//        IFruit fruit = Factory.getInstance("");
//        fruit.eat();
//    }
//}

/**
 * 反射与类操作
 */
interface Fruit{}
interface Animal{}
class I implements Fruit,Animal{}
public class Day18_1{
    public static void main(String[] args) {
        Class<?> cls = I.class;//取得Class对象
        //取得Package名称
        System.out.println(cls.getPackage().getName());
        //取得父类名称
        System.out.println(cls.getSuperclass().getName());
        //取得实现的父接口对象
        Class<?>[] iclass = cls.getInterfaces();
        for(Class<?> class1 : iclass){
            System.out.println(class1.getName());
        }
    }
}