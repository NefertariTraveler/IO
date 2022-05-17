package com.javacto.day6.a;

import java.io.*;

/**
 * 字节缓冲流
 * liu
 **/
public class Test1 {
    public static void main(String[] args) throws IOException {
        //test1();
        //test2();
        test3();
    }

    //总共耗时16毫秒
    private static void test3() throws IOException {
        //记录开始时间
        long start = System.currentTimeMillis();
        //1.1创建字节输入缓冲流  读
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\file io\\风.zip"));
        //1.1创建缓冲字节输出流  写
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\file io\\cc\\aa\\bb\\asas.zip"));
        //定义数组对象   每次读取多少个字节
        byte[] bytes = new byte[1024];
        //定义长度
        int len;
        //3.循环读取
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            //4写
            bufferedOutputStream.write(bytes,0,len);
        }
        //5.释放资源
        bufferedOutputStream.close();
        bufferedInputStream.close();
        //记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("总共耗时"+(end-start)+"毫秒");
    }

    //使用缓冲流解决复制大文件慢的问题  感觉还是有点慢  总共耗时42毫秒
    private static void test2() throws IOException {
        //记录开始时间
        long start = System.currentTimeMillis();
        //1.1创建字节输入缓冲流  读
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\file io\\风.zip"));
        //1.1创建缓冲字节输出流  写
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\file io\\cc\\aa\\bb\\asas.zip"));
        //定义数组对象   每次读取多少个字节
        byte[] bytes = new byte[1];
        //定义长度
        int len;
        //3.循环读取
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            //4写
            bufferedOutputStream.write(bytes,0,len);
        }
        //5.释放资源
        bufferedOutputStream.close();
        bufferedInputStream.close();
        //记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("总共耗时"+(end-start)+"毫秒");
    }


    //通过字节流复制大文件，很慢 等了很久还没复制完  可使用缓冲流解决复制大文件慢的问题 总共耗时3593毫秒
    private static void test1() throws IOException {
        //记录开始时间
        long start = System.currentTimeMillis();
        //1.1创建字节输入流  读
        FileInputStream fileInputStream = new FileInputStream("D:\\file io\\风.zip");
        //1.1创建字节输出流  写
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\file io\\cc\\aa\\bb\\as.zip");
        //定义数组对象   每次读取多少个字节
        byte[] bytes = new byte[1];
        //定义长度
        int len;
        //3.循环读取
        while ((len = fileInputStream.read(bytes)) != -1) {
            //4写
            fileOutputStream.write(bytes,0,len);
        }
        //5.释放资源
        fileOutputStream.close();
        fileInputStream.close();
        //记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("总共耗时"+(end-start)+"毫秒");
    }
}
