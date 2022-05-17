package com.javacto.day6.a;

import java.io.*;

/**
 * liu
 **/
public class Test2 {
    public static void main(String[] args) throws IOException {
        //test1();
        //test2();
        test3();
    }

    //总耗时：1毫秒
    private static void test3() throws IOException {
        //获取当前时间
        long start = System.currentTimeMillis();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\file io\\风.zip"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\file io\\cc\\aa\\bb\\但什么是.zip"));
        //定义字节数组
        byte[] bytes = new byte[1024];
        //定义长度
        int len;
        //循环遍历
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes,0,len);
        }
        //释放资源
        bufferedOutputStream.close();
        bufferedInputStream.close();
        //获取当前时间
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start) + "毫秒");
    }

    private static void test2() throws IOException {
        //获取当前时间
        long start = System.currentTimeMillis();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\file io\\风.zip"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\file io\\cc\\aa\\bb\\但是.zip"));
        //定义字节数组
        byte[] bytes = new byte[1];
        //定义长度
        int len;
        //循环遍历
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes,0,len);
        }
        //释放资源
        bufferedOutputStream.close();
        bufferedInputStream.close();
        //获取当前时间
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start) + "毫秒");
    }

    //总耗时：3607毫秒
    private static void test1() throws IOException {
        //获取当前时间
        long start = System.currentTimeMillis();
        //字节输入流对象
        FileInputStream fileInputStream = new FileInputStream("D:\\file io\\风.zip");
        //字节输出流对象
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\cc\\aa\\bb\\asd.zip");
        //定义字节数组
        byte[] bytes = new byte[1];
        //定义长度
        int len;
        //循环遍历
        while ((len = fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes,0,len);
        }
        //释放资源
        fileOutputStream.close();
        fileInputStream.close();
        //获取当前时间
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start) + "毫秒");
    }
}
