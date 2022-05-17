package com.javacto.day4.a;

import java.io.*;

/**
 * liu
 **/
public class Test2 {
    public static void main(String[] args) throws IOException {
        //test1();
        //test2();
        //test3();
        //test4();
        //test5();
        test6();
    }

    private static void test6() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\aa.txt");
        String[] strings = {"a","b","c","d"};
        for (String string : strings) {
            fileOutputStream.write(string.getBytes());
            fileOutputStream.write("\r".getBytes());
        }
        fileOutputStream.close();
    }

    private static void test5() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\aa.txt",true);
        byte[] bytes = "bbbb".getBytes();
        fileOutputStream.write(bytes,0,bytes.length);
        fileOutputStream.close();
    }

    private static void test4() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\aa.txt");
        byte[] bytes = "bbbb".getBytes();
        fileOutputStream.write(bytes,0,bytes.length);
        fileOutputStream.close();
    }

    private static void test3() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\aa.txt");
        byte[] bytes = "好好学习".getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    private static void test2() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\aa.txt");
        fileOutputStream.write(97);
        fileOutputStream.write(98);
        fileOutputStream.write(99);
        fileOutputStream.write(100);
        fileOutputStream.close();
    }

    private static void test1() throws FileNotFoundException {
        //字节输出流的两种创建方式
        FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\file io\\aa.txt"));
        FileOutputStream fileOutputStream1 = new FileOutputStream("D:\\file io\\aa.txt");
        //字节输入流的两种创建方式
        FileInputStream fileInputStream = new FileInputStream(new File("D:\\file io\\aa.txt"));
        FileInputStream fileInputStream1 = new FileInputStream("D:\\file io\\aa.txt");
    }
}
