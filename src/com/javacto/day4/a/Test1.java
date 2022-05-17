package com.javacto.day4.a;

import java.io.*;

/**
 * liu
 **/
public class Test1 {
    public static void main(String[] args) throws IOException {
        //test1();
        //test2();
        //test3();
        //test4();
        //test5();
        test6();
    }

    private static void test6() throws IOException {
        //1.字节输出流 对象   就是写
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\aa.txt");
        //换行
        //fileOutputStream.write("\r".getBytes());
        //byte[] bytes = "eeee".getBytes();
        //3.写write(b, off, len);    (需写的对象byte[] b, 从下标几开始, 写几个)
        //fileOutputStream.write(bytes,0,bytes.length);
        //2.定义数组
        String[] strings = {"a","b","c","d"};
        //3.循环遍历
        for (String string : strings) {
            fileOutputStream.write(string.getBytes());
            fileOutputStream.write("\r".getBytes());
        }
        //4释放资源
        fileOutputStream.close();
    }

    private static void test5() throws IOException {
        //1.字节输出流 对象   就是写
        //原数据不动情况下、写入
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\aa.txt",true);
        //2.定义byte【】数组
        byte[] bytes = "bbbb".getBytes();
        //3.写write(b, off, len);    (需写的对象byte[] b, 从下标几开始, 写几个)
        fileOutputStream.write(bytes,0,bytes.length);
        //4释放资源
        fileOutputStream.close();
    }

    private static void test4() throws IOException {
        //1.字节输出流 对象   就是写
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\aa.txt");
        //2.定义byte【】数组
        byte[] bytes = "bbbb".getBytes();
        //3.写write(b, off, len);    (需写的对象byte[] b, 从下标几开始, 写几个)
        fileOutputStream.write(bytes,0,bytes.length);
        //4释放资源
        fileOutputStream.close();
    }

    private static void test3() throws IOException {
        //1.字节输出流 对象   就是写
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\aa.txt");
        //2.定义byte【】数组
        byte[] bytes = "好好学习".getBytes();
        //3.写
        fileOutputStream.write(bytes);
        //4释放资源
        fileOutputStream.close();
    }

    private static void test2() throws IOException {
        //1.字节输出流 对象   就是写
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\aa.txt");
        //2.开始写
        fileOutputStream.write(97);
        fileOutputStream.write(98);
        fileOutputStream.write(99);
        fileOutputStream.write(100);
        //3.必需要关闭资源
        fileOutputStream.close();
    }

    /*public FileOutputStream(File file) ：创建文件输出流以写入由指定的 File对象表示的文件。
	public FileOutputStream(String name) ： 创建文件输出流以指定的名称写入文件。*/
    private static void test1() throws FileNotFoundException {
        //1创建  字节输出流 对象   就是写
        //创建的第一种方式
        FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\file io\\aa.txt"));
        //创建的第二种方式
        FileOutputStream fileOutputStream1 = new FileOutputStream("D:\\file io\\aa.txt");
        //2.创建字节输入流  就是读
        FileInputStream fileInputStream = new FileInputStream(new File("D:\\file io\\aa.txt"));
        FileInputStream fileInputStream1 = new FileInputStream("D:\\file io\\aa.txt");
    }
}
