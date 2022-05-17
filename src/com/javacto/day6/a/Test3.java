package com.javacto.day6.a;

import java.io.*;

/**
 * liu
 **/
public class Test3 {
    public static void main(String[] args) throws IOException {
        //test1();
        //test2();
        test3();
    }

    //总耗时：3毫秒
    private static void test3() throws IOException {
        long start = System.currentTimeMillis();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\file io\\风.zip"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\file io\\cc\\aa\\bb\\assdfsdaffad.zip"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes,0,len);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start) + "毫秒");
    }


    //总耗时：26毫秒
    private static void test2() throws IOException {
        long start = System.currentTimeMillis();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\file io\\风.zip"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\file io\\cc\\aa\\bb\\assdfad.zip"));
        byte[] bytes = new byte[1];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes,0,len);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start) + "毫秒");
    }

    //总耗时：3585毫秒
    private static void test1() throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream("D:\\file io\\风.zip");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\cc\\aa\\bb\\asd.zip");
        byte[] bytes = new byte[1];
        int len;
        while ((len = fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes,0,len);
        }
        fileOutputStream.close();
        fileInputStream.close();
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start) + "毫秒");
    }
}
