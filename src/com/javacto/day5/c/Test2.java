package com.javacto.day5.c;

import java.io.FileWriter;
import java.io.IOException;

/**
 * liu
 **/
public class Test2 {
    public static void main(String[] args) throws IOException {
        //test1();
        //test2();
        test3();
    }

    private static void test3() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("D:\\file io\\aa.txt",true);
            String[] strings = {"好","好","学","习"};
            for (String string : strings) {
                fileWriter.write(string);
                fileWriter.write("\r");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void test2() throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\file io\\aa.txt",true);
        String[] strings = {"好","好","学","习"};
        for (String string : strings) {
            fileWriter.write(string);
            fileWriter.write("\r");
        }
        fileWriter.close();
    }

    private static void test1() throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\file io\\aa.txt",true);
        fileWriter.write(97);
        fileWriter.write(98);
        fileWriter.write("\r");
        fileWriter.write("好好学习");
        fileWriter.close();
    }
}
