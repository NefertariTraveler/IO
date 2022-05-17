package com.javacto.day6.b;

import java.io.*;

/**
 * liu
 **/
public class Test2 {
    public static void main(String[] args) throws IOException {
        //test1();
        test2();
    }

    private static void test2() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\file io\\aa.txt"));
        bufferedWriter.write(97);
        bufferedWriter.write(98);
        bufferedWriter.write("\r");
        //bufferedWriter.newLine();
        bufferedWriter.write("sdfsda");
        bufferedWriter.close();
    }

    private static void test1() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\file io\\aa.txt"));
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }
        bufferedReader.close();
    }
}
