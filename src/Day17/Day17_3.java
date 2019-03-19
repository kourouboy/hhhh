package Day17;

/**
 * 注解
 */

/**
 * @Override  准确覆写
 */
//class Person2{
//    @Override
//    public String toString(){//对toString方法覆写
//        return "baby";
//    }
//}
//public class Day17_3 {
//    public static void main(String[] args) {
//        System.out.println(new Person2());
//    }
//}

/**
 * 声明过期 @Deprecated
 * 压制警告 @SuppressWarnings
 */
//class Person2{
//    @Deprecated//表示该方法已经不建议使用，但即使用了也不会出错
//    public Person2() {}
//    public Person2(String name ) {}
//    @Deprecated
//    public void fun() {}
//}
//public class Day17_3{
//    @SuppressWarnings({"rawtypes","unused"})//压制警告
//    public static void main(String[] args) {
//        Person2 p = new Person2();//标示出过期
////        p.fun();
////        p = new Person2("zhu");
//    }
//}

/**
 * 接口定义增强
 */

/**
 * 1.用default来定义普通方法，需要通过对象调用
 * 2.用static来定义静态方法，通过接口名就可以调用
 */
//interface IMessage {
//    public default void fun(){//普通方法，有了方法体
//        System.out.println("hello message");
//    }
//    public static IMessage getInstance(){
//        return new IMessageImpl();
//    }
//    public void print() ;
//}
//class IMessageImpl implements IMessage{
//    @Override
//    public void print() {
//        System.out.println("hello messageimpl");
//    }
//}
//public class Day17_3{
//    public static void main(String[] args) {
////        IMessage m = new IMessageImpl();
//        IMessage m = IMessage.getInstance();
//
//        m.fun();
//        m.print();
//    }
//}
/**
 *Lambda表达式  语法（参数） -> 单行语句 多行语句用{}；
 */

//传统面向对象开发 vs 函数式编程
//    @FunctionalInterface //  表示一个函数式编程接口，只允许有一个方法
//interface Inner{
//    //public void print();//这是一个接口，接口中的抽象方法必须由子类覆写
//    public int add(int x ,int y);
//}
//public class Day17_3{
//    public static void main(String[] args) {
        //-------------------------------------
//        Inner n = new Inner() {//匿名内部类
//            @Override
//            public void print() {//需要完整的语法
//                System.out.println("hello bit");
//            }
//        };
//        n.print();
        //-------------------------------------
//        Inner n = () -> {
//            System.out.println("hello bit ");
//            System.out.println("hello world");
//        };
//        n.print();
//        //-------------------------------------
//        Inner n = (r1,r2) -> r1 + r2 ;
//        System.out.println(n.add(12,34));
//        //------------------------------------
//        Inner n1 = (r1,r2) -> {
//          r1 += 12;
//          r2 += 11;
//          return r1 + r2;
//        };
//        System.out.println(n1.add(10,20));
//    }
//}

/**
 *方法引用
 */
//class Person0{
//    private String name ;
//    private int age;
//
//    @Override
//    public String toString() {
//        return "Person0{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    public Person0(String name, int age) {
//        this.name = name;
//        this.age = age;
//
//    }
//}
//--------------------------
    //引用静态方法
//interface IUnn<P,R1,R2>{
//     public R switchPara(P p);
//    public P switchPara();
//    public P createPerson(R1 r1,R2 r2);
//}
//public class Day17_3{
//    public static void main(String[] args) {
        //----------------------------
        //引用静态方法
//        IUnn<Integer,String> i = String :: valueOf;//进行方法引用
//        String str = i.switchPara(12);//相当于调用了String.valueOf(12)
//        System.out.println(str.length());
        //----------------------------
        //引用对象方法
//        IUnn<String> iu = "bit" :: toUpperCase;// 方法引用
//        System.out.println(iu.switchPara());//转换的是“bit”
        //----------------------------
        //引用类中普通方法 ????
//        IUnn<Integer,String> i = String :: compareTo;
//        System.out.println(i.compara("牛","猪"))；
        //----------------------------
        //引用构造方法
//        IUnn<Person,String,Integer> i = Person :: new;
//        System.out.println(i.createPerson("zhu",18));
//    }
//}