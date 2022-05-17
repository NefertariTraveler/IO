package com.javacto.day5.a;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * liu
 **/
public class Test5 {
    public static void main(String[] args) throws IOException {
        //test1();
        //test2();
        test3();
    }

    private static void test3() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\file io\\aa.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\cc\\aa\\bb\\asd.txt");
        byte[] bytes = new byte[1024];
        int len ;
        while ((len = fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes,0,len);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }

    private static void test2() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\file io\\aa.txt");
        byte[] bytes = new byte[2];
        int len ;
        while ((len = fileInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }
        fileInputStream.close();
    }

    private static void test1() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\file io\\aa.txt");
        byte[] bytes = new byte[2];
        int len ;
        while ((len = fileInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes));
        }
        fileInputStream.close();
    }
}
