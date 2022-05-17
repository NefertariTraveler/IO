package com.javacto.day3.b;

import java.io.File;

/**
 * liu
 **/
public class Test5 {
    public static void main(String[] args) {
        File file = new File("D:\\file io");
        test1(file);
    }

    private static void test1(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                test1(file1);
            }else {
                if (file1.getName().endsWith(".txt")) {
                    System.out.println(file1);
                }
            }
        }
    }
}
