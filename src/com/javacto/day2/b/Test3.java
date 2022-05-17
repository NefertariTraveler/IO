package com.javacto.day2.b;

/**
 * liu
 **/
public class Test3 {
    public static void main(String[] args) {
        //a();
        //b(1);
        //1~100和
        int count = 0;
        for (int i = 0; i < 101; i++) {
            count += i;
        }
        System.out.println(count);
        //1~5阶乘
        int count1 = 1;
        for (int i = 1; i < 6; i++) {
            count1 = count1 * i;
        }
        System.out.println(count1);

        int count2 = getCount(101);
        System.out.println(count2);
    }

    private static int getCount(int num) {
        int count = 0;
        for (int i = 0; i < num; i++) {
            count += i;
        }
        return count;
    }

    private static void b(int i) {
        if (i == 50000) {
            return;
        }
        System.out.println(i);
        b(++i);
    }

    private static void a() {
        System.out.println("死循环");
        a();
    }
}
