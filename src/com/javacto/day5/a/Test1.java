package com.javacto.day5.a;

import java.io.*;

/**
 * liu
 **/
public class Test1 {
    public static void main(String[] args) throws IOException {
        //test1();
        //test2();
        test3();
    }

    //通过字节流复制文件   (包括任何文件  aa.jpg bb.rar  cc.doc)
    private static void test3() throws IOException {
        //1.1创建字节输入流对象  读
        FileInputStream fileInputStream = new FileInputStream("D:\\file io\\3046871768_14_747_533.jpg");
        //1.2创建字节输出流对象  写
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\file\\aa\\cc.jpg");
        //定义数组
        byte[] bytes = new byte[1024];
        //定义长度
        int len;
        //循环遍历
        while ((len = fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes,0,len);
        }
        //释放资源
        fileOutputStream.close();
        fileInputStream.close();
    }

    //字节流读取中文 会乱码  切成两半了  所以说我们要学字符流
    private static void test2() throws IOException {
        //创建输入流对象 读
        FileInputStream fileInputStream = new FileInputStream("D:\\file io\\aa.txt");
        //2.定义数组  每次读取两个字节    上一次每次只能读一个
        byte[] bytes = new byte[2];
        int read;
        while ((read = fileInputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,read));
        }
        fileInputStream.close();
    }

    private static void test1() throws IOException {
        //创建输入流对象 读
        FileInputStream fileInputStream = new FileInputStream("D:\\file io\\aa.txt");
        //2.定义数组  每次读取两个字节    上一次每次只能读一个
        byte[] bytes = new byte[2];
        int read;
        while ((read = fileInputStream.read(bytes))!=-1){
            System.out.println(new String(bytes));
        }
        fileInputStream.close();
    }
}
