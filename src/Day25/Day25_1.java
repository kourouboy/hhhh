package Day25;

import java.io.*;

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
        class CopyFileUtil{ //此时合格工具类不需要任何属性，建议将构造方法私有化，并且文件操作方法均为类方法

            private CopyFileUtil(){}//私有化构造方法


            /**
             * 判断要拷贝的源路径是否存在
             * @param path  源路径信息
             * @return  路径存在返回true
             */
        public static boolean fileIsExists(String path) {
                return new File(path).exists();
            }


            /**
             * 根据传入的路径判断父路径是否存在，不存在则创建
             * @param path 输出的目标地址，根据此地址判断
             */
            public static void createParentDir(String path){
            File file = new File(path);
            if(!file.getParentFile().exists()){
                file.getParentFile().mkdirs();
                }
            }
            public static boolean CopyFile(String sourcePath,String destPath) throws Exception {
                File infile = new File(sourcePath);
                File outfile = new File(destPath);
                FileInputStream fileInputStream = null;
                FileOutputStream fileOutputStream = null;
                fileInputStream = new FileInputStream(infile);
                fileOutputStream = new FileOutputStream(outfile);
                copyFileHeadle(fileInputStream,fileOutputStream);//拷贝

                return true;
            }
            public static void copyFileHeadle(InputStream inputStream,OutputStream outputStream){

            }
        }

