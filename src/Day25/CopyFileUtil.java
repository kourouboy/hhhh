package Day25;

import java.io.*;
import java.lang.reflect.Field;

/**
 * 转换流
 */

//----转换流的基本使用---
//public class Day25_1 {
//    public static void main(String[] args) throws Exception {
//        File file = new File("C:\\Users\\13764\\Desktop\\java.txt");
//        if(!file.getParentFile().exists()){
//            file.getParentFile().mkdirs();
//        }
//        OutputStream output = new FileOutputStream(file);
//        Writer out = new OutputStreamWriter(output);//字节流 —> 字符流
//        String str = "hello bit";
//        out.write(str);
//        out.close();

        //------文件拷贝---------

        /**
         * this class : 建立一个专门负责文件拷贝处理的类，具备以下功能：
         * 1.判断拷贝的源文件是否存在、
         * 2.判断目标文件的父路径是否存在，不存在则创建父目录
         * 3.进行文件的拷贝
         */
        public  class CopyFileUtil{


            /**
             *
             * @param sourcePath  源文件
             * @param destPath 目标文件
             * @return
             * @throws Exception
             */
            public static void cp(String sourcePath,String destPath) throws Exception {
                checkArgumentNotNull(sourcePath,"参数异常");
                checkArgumentNotNull(destPath,"参数异常");
                File sourceFile = new File(sourcePath);
                checkFile(sourceFile,"source file must be file and exists");

                File deskFile = new File(destPath);
                checkParentFile(deskFile,"deskFile file must be not null");
                dataCopy(sourceFile,deskFile);
            }

            private static void dataCopy(File source, File desk) throws Exception {
                InputStream in = new FileInputStream(source);
                OutputStream out = new FileOutputStream(desk);

                //开始拷贝
                //一：read（）效率太低
                //二：do while （至少执行一次）
                //三：byte[] , while()
                byte[] buff = new byte[1024*1024];
                int len = -1;
                while ((len = in.read(buff))!= -1){
                    out.write(buff,0,len);
                }
            }



            /**
             * 检查参数不为null，如果为null ，抛出异常
             * @param args 参数
             * @param msg 异常提示信息
             */
            private static void checkArgumentNotNull(Object args,String msg){
                if(args == null){
                    throw new IllegalArgumentException(msg);
                }
            }

            private static void checkFile(File file,String msg){
                if(file == null || file.exists() || file.isDirectory()){
                    throw new IllegalArgumentException(msg);
                }
            }
            private static void checkParentFile(File file ,String msg) {
                if (file == null || file.isDirectory()) {
                    throw new IllegalArgumentException(msg);
                }
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    boolean rs = parentFile.mkdirs();
                    if (!rs) {
                        throw new RuntimeException("创建目录失败");
                    }
                }
            }

            public static void main(String[] args) throws Exception {
                cp("D:\\c语言录屏。\\C语言课件V3\\初级","C:\\Users\\13764\\Desktop\\C语言课件V3");
            }
        }

