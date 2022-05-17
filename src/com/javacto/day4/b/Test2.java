package com.javacto.day4.b;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * liu
 **/
public class Test2 {
    public static void main(String[] args) throws IOException {
        //test1();
        test2();
    }

    private static void test2() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\file io\\aa.txt");
        int read;
        while ((read = fileInputStream.read()) != -1) {
            System.out.println((char) read);
        }
        fileInputStream.close();
    }

    private static void test1() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\file io\\aa.txt");

        int read = fileInputStream.read();
        System.out.println((char) read);

        read = fileInputStream.read();
        System.out.println((char) read);

        read = fileInputStream.read();
        System.out.println((char) read);

        read = fileInputStream.read();
        System.out.println((char) read);

        read = fileInputStream.read();
        System.out.println(read);
    }
}
