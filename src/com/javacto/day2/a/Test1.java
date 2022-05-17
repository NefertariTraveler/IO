package com.javacto.day2.a;

import java.io.File;
import java.io.IOException;

/**
 * liu
 **/
public class Test1 {
    public static void main(String[] args) throws IOException {
        //test1();
        //test2();
        test3();
    }

    /**
     * public String[] list()  ：返回一个String数组，表示该File目录中的所有子文件或目录。
     * public File[] listFiles()  ：返回一个File数组，表示该File目录中的所有的子文件或目录。
     **/
    private static void test3() {
        //1.创建File对象
        File file = new File("D:\\file io\\file");
        //2.返回一个String数组
        String[] strList = file.list();
        //3循环遍历输出子文件或目录
        for (String str : strList) {
            System.out.println(str);
        }
        System.out.println("==================");
        //2.2返回一个File数组
        File[] files = file.listFiles();
        //3.2循环遍历子文件或目录
        for (File file1 : files) {
            System.out.println(file1);
        }

    }

    /**
     * public boolean createNewFile()  ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
     * public boolean delete()  ：删除由此File表示的文件或目录。
     * public boolean mkdir()  ：创建由此File表示的目录。
     * public boolean mkdirs()  ：创建由此File表示的目录，包括任何必需但不存在的父目录
     */
    private static void test2() throws IOException {
        //1.创建File对象
        File file = new File("D:\\file io\\cc\\aa\\bb");
        File file2 = new File("D:\\file io\\file\\ee.txt");

        /*if (file.exists()) {
            System.out.println("目录存在");
            file.delete();
            System.out.println("删除成功");
        }else {
            System.out.println("目录不存在");
            file.mkdirs();
            System.out.println("创建成功");
        }*/

        if (!file.exists()) {
            System.out.println("目录不存在");
            file.mkdirs();
            System.out.println("创建成功");
        }else {
            System.out.println("目录存在");
            file.delete();
            System.out.println("删除成功");
        }

        if (!file2.exists()) {
            System.out.println("文件不存在");
            file2.mkdirs();
            file2.delete();
            file2.createNewFile();
            System.out.println("文件创建成功");
        }else {
            file2.delete();
            System.out.println("文件删除成功");
        }
    }

    /**
     * public boolean exists()  ：此File表示的文件或目录是否实际存在。
	 * public boolean isDirectory()  ：此File表示的是否为目录。
	 * public boolean isFile()  ：此File表示的是否为文件。
     **/
    private static void test1() {
        File file = new File("D:\\file io\\aa.txt");
        System.out.println("文件或目录是否存在：" + file.exists());
        System.out.println("此file是否为目录：" + file.isDirectory());
        System.out.println("此File是否为文件:" + file.isFile());
    }
}
