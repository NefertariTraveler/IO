package com.javacto.day2.a;

import java.io.File;
import java.io.IOException;

/**
 * liu
 **/
public class Test4 {
    public static void main(String[] args) throws IOException {
        //test1();
        //test2();
        test3();
    }

    private static void test3() {
        File file = new File("D:\\file io");
        String[] list = file.list();
        for (String sql : list) {
            System.out.println(sql);
        }
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }

    private static void test2() throws IOException {
        File file = new File("D:\\file io\\cc\\aa\\bb");
        File file2 = new File("D:\\file io\\file\\ee.txt");
        /*if (!file.exists()) {
            System.out.println("目录不存在");
            file.mkdirs();
            System.out.println("创建成功");
        }else {
            System.out.println("目录存在");
            file.delete();
            System.out.println("删除成功");
        }*/

        if (!file2.exists()) {
            System.out.println("文件不存在");
            file2.mkdirs();
            file2.delete();
            file2.createNewFile();
            System.out.println("创建成功");
        }else {
            System.out.println("文件存在");
            file2.delete();
            System.out.println("删除成功");
        }
    }

    private static void test1() {
        File file = new File("D:\\file io\\aa.txt");
        File file1 = new File("D:\\file io");
        System.out.println("文件是否存在：" + file.exists());
        System.out.println("该文件目录是否存在：" + file1.exists());
        System.out.println("是否为文件" + file.isFile());
        System.out.println("是否为文件夹：" + file1.isDirectory());
    }
}
