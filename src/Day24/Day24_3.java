package Day24;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

/**
 * 字节与字符流
 */

//-------字节输出流------
public class Day24_3 {
    public static void main(String[] args) throws Exception {
//        //1.取得终端对象
//        File file = new File("C:"+File.separator + "Users"
//                +File.separator +"13764"+File.separator + "Desktop"+File.separator+"java.txt");
//        //保证父目录存在，不存在则创建
//        if(!file.getParentFile().exists()){
//            file.getParentFile().mkdirs();
//        }
//        //2.根据终端取得指定文件输出流
//        OutputStream out = new FileOutputStream(file,true);//文件内容的追加
//        //3.进行数据的输出
//        String str = "hello world";
//        out.write(str.getBytes(),1,3);
//        //4.关闭流
//        out.close();
        //----字节输入流------
        //读取终端对象
//        File file = new File("C:\\Users\\13764\\Desktop\\java.txt");
//        if(file.exists()){
//            InputStream in = new FileInputStream(file);
//            byte[] data = new byte[1024];//每次可以读取的最大数量
//            int len = in.read(data);
//            String rs = new String(data,0,len);
//            System.out.println(rs);
//            in.close();
//        }


        //-------------字符流--------------
        //输出流
        File file = new File("C:\\Users\\13764\\Desktop\\Text.txt");
        Writer writer = new FileWriter(file);
        writer.write("bit");
        writer.flush();//刷新操作，强制清空缓冲内容，所有内容都输出
        writer.close();
//
//        //输入流
//        Reader reader = new FileReader(file);
//        char[] data = new char[1024];
//        int len = reader.read(data);
//        System.out.println(new String(data,0,len));
//        reader.close();
    }
}
