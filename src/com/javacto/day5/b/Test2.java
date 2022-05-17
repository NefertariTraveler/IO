package com.javacto.day5.b;

import java.io.FileReader;
import java.io.IOException;

/**
 * liu
 **/
public class Test2 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException {
        FileReader fileReader = new FileReader("D:\\file io\\aa.txt");
        char[] chars = new char[2];
        int len;
        while ((len = fileReader.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }
        fileReader.close();
    }
}
