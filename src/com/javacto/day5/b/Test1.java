package com.javacto.day5.b;

import java.io.FileReader;
import java.io.IOException;

/**
 * liu
 * 字符输入流
 **/
public class Test1 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException {
        //创建字符输入流
        FileReader fileReader = new FileReader("D:\\file io\\aa.txt");
        //创建数组
        char[] chars = new char[2];
        //定义长度
        int len;
        //循环遍历
        while ((len = fileReader.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }
        //释放资源
        fileReader.close();
    }
}
