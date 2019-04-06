package Day26;

import java.util.Scanner;

//工具类
public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()){
//            System.out.println("请输入的内容："+scanner.next());
            System.out.println("请输入年龄");
            if(scanner.hasNextInt()){
                int age = scanner.nextInt();
                System.out.println(age);
            }else{
                System.out.println("输入不合法");
            }
        }
    }
