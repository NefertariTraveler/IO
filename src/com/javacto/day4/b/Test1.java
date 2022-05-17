package com.javacto.day4.b;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * liu
 **/
public class Test1 {
    public static void main(String[] args) throws IOException {
        //test1();
        test2();
    }

    private static void test2() throws IOException {
        //字节输入流 读
        FileInputStream fileInputStream = new FileInputStream("D:\\file io\\aa.txt");
        //2定义一个变量
        int len;
        while ((len = fileInputStream.read()) != -1) {
            System.out.println((char) len);
        }
        //关闭资源
        fileInputStream.close();
    }

    private static void test1() throws IOException {
        //字节输入流 读
        FileInputStream fileInputStream = new FileInputStream("D:\\file io\\aa.txt");

        //2.读取数据
        int read = fileInputStream.read();//每次读取一个字节
        System.out.println((char)read);

        read = fileInputStream.read();//2
        System.out.println((char)read);

        read = fileInputStream.read();//3
        System.out.println((char)read);

        read = fileInputStream.read();//4
        System.out.println((char)read);

        read = fileInputStream.read();//5
        System.out.println(read);
    }
}
