package Day25;

import java.io.*;

/**
 * 文件的合并
 */
public class Day25_3 {

    public static void main(String[] args) throws Exception {

        String fileA = "C:\\Users\\13764\\Desktop\\新建文件夹\\1.txt";
        String fileB = "C:\\Users\\13764\\Desktop\\新建文件夹\\2.txt";
        String file = "C:\\Users\\13764\\Desktop\\新建文件夹\\data.txt";


        FileInputStream in1 = new FileInputStream(fileA);
        FileInputStream in2 = new FileInputStream(fileB);
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        FileOutputStream fout = new FileOutputStream(file);

        byte[] buff = new byte[4];
        int len = -1;
        //in1 => bout
        while ((len = in1.read(buff))!= -1){
            bout.write(buff,0,len);
        }

        //in2 => bout
        while ((len = in2.read(buff))!= -1){
            bout.write(buff,0,len);
        }
        //bout => fout
        byte[] newData = bout.toByteArray();
        fout.write(newData);
        fout.flush();

    }
}
