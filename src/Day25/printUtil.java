package Day25;

import org.omg.CORBA.portable.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 自定义打印流
 */
class PrintUtil {
      private FileOutputStream out;

      public PrintUtil(FileOutputStream out){
          this.out = out;
      }
      public void writeString(String str){
          try {
              out.write(str.getBytes());
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
      private void writeInt(int val){
          writeString(String.valueOf(val));
      }
      private void writeLong(long val){
          writeString(String.valueOf(val));
      }
      //TODO

    public static void code1()throws Exception {
        FileOutputStream  out = new FileOutputStream("C:\\Users\\13764\\Desktop\\合并\\print.txt");
        PrintUtil printUtil = new PrintUtil(out);
        printUtil.writeString("hello word \n");
        printUtil.writeInt(22 );
        printUtil.writeLong(22L);
    }

    public static void main(String[] args)throws Exception  {
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(
                "C:\\Users\\13764\\Desktop\\合并\\write.txt"));
                printWriter.write(22);

    }
}
