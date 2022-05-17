package com.javacto.day6.a;

import java.io.*;

/**
 * liu
 **/
public class Test4 {
    public static void main(String[] args) throws IOException {
        //test1();
        //test2();
        test3();
    }

    //3
    private static void test3() throws IOException {
        long start = System.currentTimeMillis();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\file io\\风.zip"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\file io\\cc\\aa\\bb\\阿萨德12.zip"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes,0,len);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    //20
    private static void test2() throws IOException {
        long start = System.currentTimeMillis();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\file io\\风.zip"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\file io\\cc\\aa\\bb\\阿萨德1.zip"));
        byte[] bytes = new byte[1];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes,0,len);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }


    //3625
    private static void test1() throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream("D:\\file io\\风.zip");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\cc\\aa\\bb\\阿萨德.zip");
        byte[] bytes = new byte[1];
        int len;
        while ((len = fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes,0,len);
        }
        fileOutputStream.close();
        fileInputStream.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
