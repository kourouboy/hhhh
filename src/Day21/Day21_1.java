package Day21;

//import java.lang.reflect.Constructor;
//import java.lang.reflect.InvocationTargetException;
//
//class Person{
//    private String name ;
//    private int age;
//
//    private Person(){}
//    protected Person(String name ){}
//    public  Person(String name,int age){
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
//public class Day21_1 {
//    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Class<Person> cls = Person.class;
//        //取得有参构造
//        Constructor constructor = cls.getConstructor(String.class,int.class);
//        //实例化对象
//        Person per = (Person) constructor.newInstance("lulu",23);
//        System.out.println(per);
//    }
//}

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class  Person{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }
}
public class Day21_1{
    public static void main(String[] args) throws Exception {
        //1.取得class对象
        Class<Person> cls = Person.class;
        //2.组装方法名称
        String setMethodName = "set" + initCap(args[0]);
        String getMethodName = "get" + initCap(args[0]);
        //3.取得Method对象
        Method setMethod = cls.getMethod(setMethodName,String.class);
        Method getMethod = cls.getMethod(getMethodName);
        //4.取得Person实例化对象然后调用
        Person per = cls.newInstance();
        setMethod.invoke(per,"lulu");
        System.out.println(getMethod.invoke(per));
    }
    private static String initCap(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}