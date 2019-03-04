package Day10;

/**
 *内部类的简单定义:在类的内部进行其他类结构的嵌套操作。
 */
/*class Outer{
    private String msg = "Hello World";
    //********************
    class Inner{//定义一个非静态内部类
    //隐藏了一个外部类对象
        public void print(){//定义一个普通方法
        //等同于调用out.msg
            System.out.println(msg);//调用msg属性 直接调用的外部类的私有属性
        }
    }
    //在外部类中定义一个方法，该方法负责产生内部类对象并且调用print()方法
    public void fun(){
     Inner in = new Inner();//实例化内部类对象
     in.print();//内部类提供的print()方法
     }
     }
     */

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import javax.print.DocFlavor;

/**
    * 虽然用了内部类导致结构复杂，但是可以直接访问外部类私有域！！
    *//*
public class Day10 {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.fun();
    }
}*/

/*class A {
    private String name = "kourouya";
    public String getName() {
        return name;
    }
}
class B {
    private int age = 12;

    public int getAge() {
        return age;
    }
}
class  Outter{
    private class InnerClassA extends A{
        @Override//继承
        public String getName() {
            return super.getName();
        }
    }
    private class InnerClassB extends B{
        @Override
        public int getAge() {
            return super.getAge();
        }
    }
    //*******************
    public String name(){
        return new InnerClassA().getName();
    }
    public int age(){
        return new InnerClassB().getAge();
    }
}
public class Day10{
    public static void main(String[] args) {
        Outter out = new Outter();
        System.out.println(out.name());
        System.out.println(out.age());
    }
}*/

/**\
 *内外部类可以访问彼此的私有属性，（内部类直接访问，外部类通过对象间接访问内部类对象）
 */
/*
class Outter{
     private String msg = "Outter中的私有属性";
     // &**********************
    class Inner {
         private String msg1 = "Inner中的私有属性";
         public void fun(){
             //内部类可以直接访问外部类私有属性
             System.out.println(msg);
         }
     }
     //*****************
    public void print(){
        Inner in = new Inner();
        System.out.println(in.msg1);
    }
}
public class Day10{
    public static void main(String[] args) {
        Outter out = new Outter();
        out.print();
    }
}
*/





