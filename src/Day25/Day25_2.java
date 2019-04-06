package Day25;

import java.io.*;

/**
 * 通过内存流实现大小写转换
 */
//此处转换都是在内存中进行
public class Day25_2 {
    public static void main(String[] args)  throws Exception {
        //System.getProperties().list(System.out);
        String msg = "hello world";
        InputStream in = new ByteArrayInputStream(msg.getBytes());
        OutputStream out = new ByteArrayOutputStream();
        int val = -1;
        while ((val = in.read()) != -1){
            int newval = Character.toUpperCase(val);
            out.write(newval);
            }
            byte[] newData = ((ByteArrayOutputStream) out).toByteArray();
        System.out.println(new String(newData));
        }
    }

