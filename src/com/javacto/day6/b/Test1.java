package com.javacto.day6.b;

import java.io.*;

/**
 * liu
 **/
public class Test1 {
    public static void main(String[] args) throws IOException {
        //test1();
        //test2();
        test3();
    }

    private static void test3() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\file io\\aa.txt"));
        bufferedWriter.write(97);
        bufferedWriter.write(98);
        bufferedWriter.write("\r");
        bufferedWriter.newLine();
        bufferedWriter.write(".dddddd");
        bufferedWriter.close();
    }

    private static void test2() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\file io\\aa.txt"));
        String str;
        while ((str = bufferedReader.readLine())!=null) {
            System.out.println(str);
        }
        bufferedReader.close();
    }

    private static void test1() throws IOException {
        //1.创建字符缓冲输入流  读
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\file io\\aa.txt"));
        //读，以前是一个一个文字读    缓冲流，一行一行的读     比之前的流多了一个方法 br.readLine() 每次读取一行
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        bufferedReader.close();
    }
}
