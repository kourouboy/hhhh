package Day16;
//-----------泛型---------------------------------------
//class Point<T>{//T表示参数，是一个占位标记，如果有多个就在后面追加
//    private T x ;
//    private T y ;
//
//    public T getX() {
//        return x;
//    }
//
//    public void setX(T x) {
//        this.x = x;
//    }
//
//    public T getY() {
//        return y;
//    }
//
//    public void setY(T y) {
//        this.y = y;
//    }
//    public  void test(T t){
//        System.out.println(t);
//    }
//    public static <E> E test2(E e){
//        return e;
//    }
//}
//public class Day16_1 {
//    public static void main(String[] args) {
//        System.out.println(add(1,2,3));
//        System.out.println(add(new int[] {2,3,4,5,7}));
//         int[] data = new int[] {1,2,3,4};
//         for( int i : data){ // 数组中的每个元素赋值给i
//             System.out.println(i);
//         }

//        Point<String> p = new Point<>();//Jdk1.7 以后的写法
//        p.setX("甜心");
//        p.setY("吃屎");
//        String x = p.getX();
//        String y = p.getY();
//        System.out.println(x + y);
//        Point<String> p = new Point<>();
//        System.out.println(Point.test2(2));
//    }
//    public static int add(int ... data){//本身还是一个数组
//        int sum = 0;
//        for (int i = 0; i <data.length ; i++) {
//            sum += data[i];
//        }
//        return sum;
//    }
//}
//_______________________________________________________________

//----------通配符------------------------------------------------

//---------------------------------------------------------------
//class Message<T>{
//    private T message;
//
//    public T getMessage() {
//        return message;
//    }
//
//    public void setMessage(T message) {
//        this.message = message;
//    }
//}
//public class Day16_1{
//    public static void main(String[] args) {
//        Message<Double> m = new Message<>();
//        m.setMessage(1233.2);
//        Message<Integer> m1 = new Message<>();
//        m1.setMessage(123);
//        fun(m);
//        fun(m1);
//
//    }
//    //通配符？ 描述它可以接受任意类型，但是由于不确定类型，所以无法修改
//    public static void fun(Message<?> m){
//        //m.setMessage(100) 无法修改
//        System.out.println(m.getMessage());
//    }
//    /**
//     * ？ extends 类 设置泛型上限
//     */
//    public  static void fun(Message<? extends Number> m){
//       //m.setMessage(111); 仍然无法修改
//        System.out.println(m.getMessage());
//    }
//    /**
//     * ? super 类 设置泛型下限，只能用于方法参数
//     */
//    public static void fun(Message<? super String> m){
//        //此时可以修改
//        m.setMessage("bit");
//        System.out.println(m.getMessage());
//    }
//}

//---------------------------------------------------------------

//---------泛型接口------------------------------------------------

//----------------------------------------------------------------

//interface Sequence<T>{
//    T test(T t);
//}

//1.子类实现接口时继续保留泛型
//class SequenceImpl<T> implements Sequence<T>{
//    @Override
//    public T test(T t) {
//        return t;
//    }
//}
//2.子类实现接口时就确定好类型
//class SequenceImpl implements Sequence<String>{
//    @Override
//    public String test(String s) {
//        return s;
//    }
//}
//public class Day16_1{
//    public static void main(String[] args) {
//        Sequence<String> s = new SequenceImpl();
//        Sequence s = new SequenceImpl();
//        System.out.println(s.test("bit"));
//    }
//}

//----------------------------------------------------

//--------------泛型的类型擦除--------------------------

import java.lang.reflect.Field;

//---------------------------------------------------
class Point<T,E extends String>{
    public T t;
    public E e;
}
public  class Day16_1{
    public static void main(String[] args) {
        Point<Integer,String> p = new Point<>();
        Field[] fields = p.getClass().getDeclaredFields();
        for (Field field : fields){
           System.out.println(field.getType());
       }
    }
}



















