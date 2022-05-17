package com.javacto.day6.c;

import java.io.*;

/**
 * liu
 **/
public class Test5 {
    public static void main(String[] args) throws IOException {
        //test1();
        test2();
    }

    private static void test2() throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("D:\\file io\\aa.txt"),"UTF-8");
        outputStreamWriter.write("fdasfdsafdsa");
        outputStreamWriter.close();
    }

    private static void test1() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("D:\\file io\\aa.txt"),"UTF-8");
        char[] chars = new char[1024];
        int len;
        while ((len = inputStreamReader.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }
        inputStreamReader.close();
    }
}
