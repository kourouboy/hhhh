package Day24;

import java.io.File;
import java.io.FileDescriptor;
import java.time.temporal.IsoFields;

/**
 * 文件信息
 */
public class Day24_2 {
    public static void main(String[] args) {
        File file = new File("C:"+File.separator + "Users"
                +File.separator +"13764"+File.separator + "Desktop");
        System.out.println(file.isFile());
        System.out.println(file.getParentFile().isDirectory());
        System.out.println(file.length()/1024);
        System.out.println (file.lastModified());
        //列出目录的全部组成
        if(file.exists() && file.isDirectory()){
            File[] files = file.listFiles();
            for(File filel :files){
                System.out.println(filel);
            }
        }
    }
}
