package com.javacto.day4.a;

import java.io.*;

/**
 * liu
 **/
public class Test5 {
    public static void main(String[] args) throws IOException {
        //test1();
        //test2();
        //test3();
        //test4();
        //test5();
        test6();
    }

    private static void test6() throws IOException {
        //字节输出流
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\aa.txt");
        //创建数组
        String[] strings = {"a","b","c","d"};
        //循环遍历
        for (String string : strings) {
            //写
            fileOutputStream.write(string.getBytes());
            //换行
            fileOutputStream.write("\r".getBytes());
        }
        //释放资源
        fileOutputStream.close();
    }

    private static void test5() throws IOException {
        //字节输出流
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\aa.txt",true);
        //创建字节数组
        byte[] bytes = "eeee".getBytes();
        //写
        fileOutputStream.write(bytes,0,bytes.length);
        //释放资源
        fileOutputStream.close();
    }

    private static void test4() throws IOException {
        //字节输出流
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\aa.txt");
        //创建字节数组
        byte[] bytes = "dddd".getBytes();
        //写
        fileOutputStream.write(bytes,0,bytes.length);
        //释放资源
        fileOutputStream.close();
    }

    private static void test3() throws IOException {
        //字节输出流
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\aa.txt");
        //创建字节数组
        byte[] bytes = "好好学习".getBytes();
        //写
        fileOutputStream.write(bytes);
        //释放资源
        fileOutputStream.close();
    }

    private static void test2() throws IOException {
        //字节输出流
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\aa.txt");
        //写
        fileOutputStream.write(97);
        fileOutputStream.write(98);
        fileOutputStream.write(99);
        fileOutputStream.write(100);
        //释放资源
        fileOutputStream.close();
    }

    private static void test1() throws FileNotFoundException {
        //字节输出流
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\aa.txt");
        FileOutputStream fileOutputStream1 = new FileOutputStream(new File("D:\\file io\\aa.txt"));
        //字节输入流
        FileInputStream fileInputStream = new FileInputStream("D:\\file io\\aa.txt");
        FileInputStream fileInputStream1 = new FileInputStream(new File("D:\\file io\\aa.txt"));
    }
}
