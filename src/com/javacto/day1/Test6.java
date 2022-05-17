package com.javacto.day1;

import java.io.File;

/**
 * liu
 **/
public class Test6 {
    public static void main(String[] args) {
        //test1();
        test2();
    }

    private static void test2() {
        File file = new File("D:\\file io\\aa.txt");
        File file1 = new File("aa.txt");

        System.out.println("绝对路径：" + file.getAbsolutePath());
        System.out.println("绝对路径：" + file1.getAbsolutePath());
        System.out.println("路径名：" + file.getPath());
        System.out.println("路径名：" + file1.getPath());
        System.out.println("文件名：" + file.getName());
        System.out.println("文件名：" + file1.getName());
        System.out.println("文件长度：" + file.length());
        System.out.println("文件长度：" + file1.length());
    }

    private static void test1() {
        String pathName = "D:\\file io\\aa.txt";
        File file = new File(pathName);
        File file1 = new File("D:\\file io\\aa.txt");

        String parent = "D:\\file io";
        String child = "aa.txt";
        File file2 = new File(parent,child);

        File parentFile = new File("D:\\file io");
        String childFile = "aa.txt";
        File file3 = new File(parentFile,childFile);
        File file4 = new File(new File("D:\\file io"),"aa.txt");
    }
}
