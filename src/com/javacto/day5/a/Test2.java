package com.javacto.day5.a;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * liu
 **/
public class Test2 {
    public static void main(String[] args) throws IOException {
        //test1();
        //test2();
        test3();
    }

    private static void test3() throws IOException {
        //字节输入流对象
        FileInputStream fileInputStream = new FileInputStream("D:\\file io\\aa.txt");
        //字节输出流对象
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\file\\aa\\asd.txt");
        //定义字节数组
        byte[] bytes = new byte[1024];
        //定义长度
        int len;
        //fileInputStream.read(bytes)
        //循环遍历
        while ((len = fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,len);
        }
        //释放资源
        fileOutputStream.close();
        fileInputStream.close();

    }

    private static void test2() throws IOException {
        //字节输入流对象
        FileInputStream fileInputStream = new FileInputStream("D:\\file io\\aa.txt");
        //定义数组 每次2字节
        byte[] bytes = new byte[2];
        int len;
        //(len = fileInputStream.read(bytes))!=-1
        while ((len = fileInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }
        //释放资源
        fileInputStream.close();
    }

    private static void test1() throws IOException {
        //字节输入流对象
        FileInputStream fileInputStream = new FileInputStream("D:\\file io\\aa.txt");
        //定义数组 每次2字节
        byte[] bytes = new byte[2];
        int len;
        //(len = fileInputStream.read(bytes))!=-1
        while ((len = fileInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes));
        }
        //释放资源
        fileInputStream.close();
    }
}
