package com.javacto.day2.b;

/**
 * liu
 **/
public class Test6 {
    public static void main(String[] args) {
        //a();
        //b(1);
        //1~100和
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            count += i;
        }
        System.out.println("1~100和" + count);
        //1~5阶乘
        int count1 = 1;
        for (int i = 1; i <=5 ; i++) {
            count1 = count1 * i;
        }
        System.out.println("1~5阶乘" + count1);

        int count2 = getCount(100);
        System.out.println("1~100和" + count2);

    }

    private static int getCount(int num) {
        int count = 0;
        for (int i = 0; i <= num ; i++) {
            count += i;
        }
        return count;
    }

    private static void b(int num) {
        if (num == 500) {
            return;
        }
        System.out.println(num);
        b(++num);
    }

    private static void a() {
        System.out.println("死循环");
        a();
    }
}
