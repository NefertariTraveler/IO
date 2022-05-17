package com.javacto.day6.c;

import java.io.*;

/**
 * liu
 * 转换流
 **/
public class Test1 {
    public static void main(String[] args) throws IOException {
        //test1();
        test2();
    }

    private static void test2() throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("D:\\file io\\aa.txt"),"UTF-8");
        outputStreamWriter.write("跟之前一模一样");
        outputStreamWriter.close();
    }

    private static void test1() throws IOException {
        //InputStreamReader  转换输入流  就是读
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("D:\\file io\\aa.txt"),"UTF-8");
        //2定义数组 每次读多个文字
        char[] chars = new char[1024];
        int len;
        while ((len = inputStreamReader.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }
        inputStreamReader.close();
    }
}
