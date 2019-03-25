package Day19;
//
//interface InterfaceA {
//        String S = "good ";
//        void f();
//        }
//
//abstract class ClassA {
//    abstract void g();
//}
//
//class ClassB extends ClassA implements InterfaceA {
//    void g() {
//        System.out.print(S);
//    }
//
//    public void f() {
//        System.out.print(" "+ S);
//    }
//}
//public class Day19_2 {
//    public static void main(String[] args) {
//        ClassA a = new ClassB();
//        InterfaceA b = new ClassB();
//        a.g();
//        b.f();
//    }
//}

//运行结果：“good  good”
//2.编程题:
//        利用接口做参数，写个计算器，能完成加减乘除运算。
//（1）定义一个接口Compute含有一个方法int computer(int n, int m)。
//（2）设计四个类分别实现此接口，完成加减乘除运算。
//（3）设计一个类UseCompute，类中含有方法：public void useCom(Compute com, int one, int two)，此方法能够用传递过来的对象调用computer方法完成运算，并输出运算的结果。
//（4）设计一个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算。

//interface Compute{
//    int computer (int m,int n);
//}
//class Add implements Compute{
//    @Override
//    public int computer(int m, int n) {
//        return m + n;
//    }
//}
//class Sub implements Compute{
//    @Override
//    public int computer(int m, int n) {
//        return m - n;
//    }
//}
//class Mull implements Compute{
//    @Override
//    public int computer(int m, int n) {
//        return m * n;
//    }
//}
//class Divl implements Compute{
//    @Override
//    public int computer(int m, int n) {
//        if(n == 0){
//            return 0;
//        }else{
//            return m / n;
//        }
//    }
//}
//class  UseCompute{
//    public void useCom(Compute com, int one, int two){
//        System.out.println(com.computer(one,two));
//    }
//}
//public class Day19_2{
//    public static void main(String[] args) {
//        Add a = new Add();
//        Sub s = new Sub();
//        Mull m = new Mull();
//        Divl d = new Divl();
//        UseCompute use = new UseCompute();
//        use.useCom(a,10,20);
//        use.useCom(s,20,10);
//        use.useCom(m,11,33);
//        use.useCom(d,23,0);
//    }
//}

//
//        3.按如下要求编写Java程序：
//（1）定义接口A，里面包含值为3.14的常量PI和抽象方法double area()。
//（2）定义接口B，里面包含抽象方法void setColor(String c)。
//（3）定义接口C，该接口继承了接口A和B，里面包含抽象方法void volume()。
//（4）定义圆柱体类Cylinder实现接口C，该类中包含三个成员变量：底圆半径radius、
//     圆柱体的高height、颜色color。
//（5）创建主类来测试类Cylinder。

//interface A {
//    final double PI = 3.14;
//    double area();
//}
//interface B{
//    void setColor(String c);
//}
//interface C extends A,B{
//    void volume();
//}
// class Cylinder implements C{
//    private double radius;
//    private double height;
//    private String color;
//
//    Cylinder(double radius, double height, String color) {
//        this.radius = radius;
//        this.height = height;
//        this.color = color;
//    }
//    public static void main(String[] args) {
//        Cylinder a=new Cylinder(1, 1, "blue");
//        System.out.println(a.area());
//        a.volume();
//
//    }
//
//    @Override
//    public double area() {
//        return PI*radius*radius*2+2*PI*radius*height ;
//    }
//
//    @Override
//    public void setColor(String color) {
//        this.color=color;
//    }
//
//    @Override
//    public void volume() {
//        this.color=color;
//    }
//}
//
// 4.完成StringUtils.java
////String类扩展功能实现
//public class Day19_2 {
//    public static void main(String[] args) {
//        String str1 = repeat('a', 0);
//        String str2 = fillBefore("abc", 'A', 5);
//        String str3 = fillAfter("abc", 'A', 5);
//        String str4 = removeAll("aa-bb-cc-dd", "-");
//        String str5 = reverse("abcd");
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println(str4);
//        System.out.println(str5);
//    }
////    /**
////     * 重复某个字符
////     *
////     * 例如：
////     * 'a' 5   => "aaaaa"
////     * 'a' -1  => ""
////     *
////     * @param c     被重复的字符
////     * @param count 重复的数目，如果小于等于0则返回""
////     * @return 重复字符字符串
////     */
//    public static String repeat(char c, int count) {
//        if (count <=0 ){
//            return "";
//        }else {
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0;i < count;i++) {
//                sb.append(c);
//            }
//            return sb.toString();
//        }
//    }
//
////
////    /**
////     * 将已有字符串填充为规定长度，如果已有字符串大于等于这个长度则返回这个字符串
////     * 字符填充于字符串前
////     *
////     * 例如：
////     * "abc" 'A' 5  => "AAabc"
////     * "abc" 'A' 2  => "abc"
////     *
////     * @param str        被填充的字符串
////     * @param filledChar 填充的字符
////     * @param len        填充长度
////     * @return 填充后的字符串
////     */
//    public static String fillBefore(String str, char filledChar, int len) {
//        if (len <= str.length()) {
//            return str;
//        }else {
//            int length = len - str.length();
//            StringBuilder sb = new StringBuilder();
//            for(int i = 0;i < length;i++) {
//                sb.append(filledChar);
//            }
//            sb.append(str);
//            return sb.toString();
//        }
//    }
////
////    /**
////     * 将已有字符串填充为规定长度，如果已有字符串大于等于这个长度则返回这个字符串<br>
////     * 字符填充于字符串后
////     * 例如：
////     * "abc" 'A' 5  => "abcAA"
////     * "abc" 'A' 3  => "abc"
////     *
////     * @param str        被填充的字符串
////     * @param filledChar 填充的字符
////     * @param len        填充长度
////     * @return 填充后的字符串
////     */
//    public static String fillAfter(String str, char filledChar, int len) {
//        if (len <= str.length()) {
//            return str;
//        }else {
//            int length = len - str.length();
//            StringBuilder sb = new StringBuilder();
//            sb.append(str);
//            for(int i = 0;i < length;i++) {
//                sb.append(filledChar);
//            }
//            return sb.toString();
//        }
//    }
//
////    /**
////     * 移除字符串中所有给定字符串
////     * 例：removeAll("aa-bb-cc-dd", "-") => aabbccdd
////     *
////     * @param str         字符串
////     * @param strToRemove 被移除的字符串
////     * @return 移除后的字符串
////     */
//    public static String removeAll(String str, String strToRemove) {
//        if (!str.contains(strToRemove)){
//            return str;
//        }else {
//            return str.replaceAll(strToRemove,"");
//        }
//    }
//
////    /**
////     * 反转字符串
////     * 例如：abcd => dcba
////     *
////     * @param str 被反转的字符串
////     * @return 反转后的字符串
////     */
//    public static String reverse(String str) {
//        // str -> char[]
//        char[] data = str.toCharArray();
//        char[] result = new char[str.length()];
//        int flag = 0;
//        for (int i = str.length()-1;i >= 0;i--) {
//            result[flag] = data[i];
//            flag++;
//        }
//        // char[] -> String
//        return String.valueOf(result);
//    }
//}
// 5.(附加题-算法)
//一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程 找出1000以内的所有完数。
//
public class Day19_2 {
    public static void main(String[] args) {
        for (int i = 1;i < 1000;i++) {
            if (isWanShu(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isWanShu(int num) {
        int result = 0;
        for(int i = 1;i < num;i++) {
            if (num % i == 0) {
                result += i;
            }
        }
        if (result == num) {
            return true;
        }
        return false;
    }
}
