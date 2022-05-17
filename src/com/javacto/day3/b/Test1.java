package com.javacto.day3.b;

import java.io.File;

/**
 * liu
 **/
public class Test1 {
    public static void main(String[] args) {
        //1.需求，打印出D:\file io 目录下面的所有文件
        //2.需求，查找出D:\file io\file文件下面的.txt文件

        File file = new File("D:\\file io");
        test1(file);
    }

    private static void test1(File file) {
        //1.得到所有Files
        File[] files = file.listFiles();
        //2.循环遍历
        for (File file1 : files) {
            //判断文件是否是目录
            if (file1.isDirectory()) {
                //如果是目录，则再获取所有目录下面的所有Files
                test1(file1);
            }else {
                if (file1.getName().endsWith(".txt")) {
                    System.out.println("后缀名为.txt的文件为：" + file1);
                }
            }
        }
    }
}
