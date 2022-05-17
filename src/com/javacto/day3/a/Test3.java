package com.javacto.day3.a;

/**
 * liu
 **/
public class Test3 {
    public static void main(String[] args) {
        int count1 = getSum1(100);
        System.out.println("1.... 100的和为"+count1);
        int count2 = getSum2(5);
        System.out.println("1.... 5的阶乘为"+count2);
    }

    private static int getSum2(int num) {
        if (num == 1) {
            return 1;
        }
        return num * getSum2(num -1);
    }

    private static int getSum1(int num) {
        if (num == 1) {
            return 1;
        }
        return num + getSum1(num-1);
    }
}
