package Day26;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * 输入流
 * BufferedReader类
 */
public class BuffRead {
    public static void main(String[] args)throws Exception {

        //字节流（输入）
        InputStream inputStream = System.in;
        //字符流（输入）
        Reader reader = new InputStreamReader(inputStream);
        //缓冲的字符流（输入）
        BufferedReader buf = new BufferedReader(reader);
        System.out.println("请输入信息");

        //回车换行，阻塞操作
        String line = null;
        while ((line = buf.readLine())!= null){
            if(line.equals("quit")){
                break;
            }
            System.out.println("打印输入："+line);
        }
    }
}
