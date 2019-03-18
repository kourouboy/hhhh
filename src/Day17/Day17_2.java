package Day17;

import com.sun.org.apache.regexp.internal.RE;

/**
 * 枚举 -- 一种高级的多例设计模式
 */
//问题抛出，定义一个动物种类的多例；
//class Animal{
//    private String title;
//    public static final int DOG_FLAG = 1;
//    public static final int CAT_FLAG = 2;
//    public static final int PANDA_FLAG =3;
//    private static final Animal DOG = new Animal("dog");
//    private static final Animal CAT = new Animal("cat");
//    private static final Animal PANDA = new Animal("panda");
//
//    public Animal(String title) {
//        this.title = title;
//    }
//    public static Animal getInstance(int a){
//        switch (a){
//            case DOG_FLAG:
//            return DOG;
//            case CAT_FLAG:
//            return CAT;
//            case PANDA_FLAG:
//            return PANDA;
//            default:
//                return  null;
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Animal{" +
//                "title='" + title + '\'' +
//                '}';
//    }
//}
//public class Day17_2 {
//    public static void main(String[] args) {
//        System.out.println(Animal.getInstance(Animal.PANDA_FLAG));
//    }
//}


//基于枚举开发
// enum Animal{
//     DOG,CAT,PANDA
//}
//public class  Day17_2{
//    public static void main(String[] args) {
//        //System.out.println(Animal.PANDA.ordinal() + " = " + Animal.PANDA.name());
//        //获取所有枚举数数据 values()返回的是一个枚举的对象数组
//        for(Animal temp : Animal.values()){
//            System.out.println(temp.ordinal() + " = " + temp.name());
//        }
//    }
//}

//在枚举中定义更多的结构；

//enum Animal{
//    DOG ("狗狗"),CAT("小猫"),PANDA("熊猫");
//    private String title;
//
//    private Animal(String title) {//构造方法私有化
//        this.title = title;
//    }
//
//    @Override
//    public String toString() {
//        return this.title;
//    }
//}
//public class Day17_2{
//    public static void main(String[] args) {
//        System.out.println(Animal.PANDA);
//    }
//}

//枚举实现接口
//interface IAnimal{
//        public String getAnimal();
//}
//enum Animal implements IAnimal{
//    DOG ("狗狗"),CAT("小猫"),PANDA("熊猫"); //枚举对象必须在第一行
//    private String title;
//
//    private Animal(String title) {//构造方法私有化
//        this.title = title;
//    }
//
//    @Override
//    public String toString() {
//        return this.title;
//    }
//
//    @Override
//    public String getAnimal() {
//        return this.title;
//    }
//}
//public class Day17_2{
//    public static void main(String[] args) {
//        IAnimal a = Animal.PANDA;
//        System.out.println(a.getAnimal());
//    }
//}

//特点：只有指定的几个对象可以使用

enum Sex {
    MALE, FEMALE;
}
//    private String title;
//    private Sex(String title) {
//        this.title = title;
//    }
//    @Override
//    public String toString() {
//        return this.title;
//    }
//}
//class Person1{
//    private String name;
//    private int age;
//    private Sex sex;
//
//    public Person1(String name, int age, Sex sex) {
//        super();
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", sex=" + sex +
//                '}';
//    }
//}
public class Day17_2{
    public static void main(String[] args) {
//        Person1 p = new Person1("甜心",21,Sex.MALE);
//        System.out.println(p);
        switch (Sex.MALE){
            case MALE:
                System.out.println("男人");
                break;
            case FEMALE:
                System.out.println("女人");
                break;
        }
    }
}