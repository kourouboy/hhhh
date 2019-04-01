package Day24;
import java.io.File;
import java.io.IOException;

/**
 * File 文件操作类
 */
public class Day24_1 {
    public static void main(String[] args) throws IOException {
//        File file = new File("D:\\c语言录屏。\\Test");
//        if(file.exists()){
//            //文件存在，进行删除
//          boolean rs= file.delete();
//            System.out.println("删除成功"+rs);
//        }else{
//            boolean te = file.createNewFile();
//            System.out.println("创建成功"+te);
//        }
        //----------------------
        //--目录操作--
        //1.取得File对象
        File file = new File("C:"+File.separator + "Users"
                +File.separator +"13764"+File.separator + "Desktop"+File.separator +"www"+ File.separator +"bit"
        + File.separator + "javaIO.java");
        //2.判断父路径是否存在，不存在就创建
        if(!file.getParentFile().exists()){//创建父目录
            file.getParentFile().mkdirs();//有多少级父目录就创造多少级
        }
        //判断文件是否存在，不存在就创建
        if(file.exists()){
            file.delete();
        }else{
            file.createNewFile();
        }
    }
}