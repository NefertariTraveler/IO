package com.javacto.day1;

import java.io.File;

/**
 * liu
 **/
public class Test1 {
    public static void main(String[] args) {
        //test1();
        test2();
    }

    /**
     * public String getAbsolutePath()  ：返回此File的绝对路径名字符串。
     * 1：绝对路径 就是从盘盘的根目录开始 D:/zzw/file/aa.txt这就是绝对路径     相对路径  不是绝对路径就是相对路径
     public String getPath()  ：将此File转换为路径名字符串。
     public String getName()  ：返回由此File表示的文件或目录的名称。
     public long length()  ：返回由此File表示的文件的长度。
     */
    private static void test2() {
        //1.创建File文件实例对象
        File file = new File("D:\\file io\\aa.txt");//构造方法传的是绝对路径
        File file1 = new File("aa.txt");//构造方法传的是相对路径

        System.out.println("绝对路径：" + file.getAbsolutePath());
        System.out.println("绝对路径1：" + file1.getAbsolutePath());

        System.out.println("文件路径名：" + file.getPath());
        System.out.println("文件路径名：" + file1.getPath());

        System.out.println("文件名：" + file.getName());
        System.out.println("文件名：" + file1.getName());

        System.out.println("文件长度:" + file.length());
        System.out.println("文件长度:" + file1.length());
    }

    /**
     * File(String pathname)   通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
     * 在java中文件路径 D:\zzw\file\aa.txt 必需改为D:\\zzw\\file\\aa.txt
     * 或者，D:/zzw/file/aa.txt
     */
    private static void test1() {
        String pathName = "D:\\file io\\aa.txt";
        File file = new File(pathName);
        //把上面两行代码修改为一行
        File file1 = new File("D:\\file io\\aa.txt");

        //File(String parent, String child) 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例
        String parent = "D:\\file io";
        String child = "aa.txt";
        File file2 = new File(parent,child);

        //File(File parent, String child)   根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
        File parentFile = new File("D:\\file io");
        String childFile = "aa.txt";
        File file3 = new File(parentFile,childFile);
        //把上面三行代码修改为一行
        File file4 = new File(new File("D:\\file io"),"aa.txt");
    }
}
