package com.javacto.day2.b;

/**
 * liu
 **/
public class Test1 {
    public static void main(String[] args) {
        //a();
        //b(1);

        //需求1：  求  1.... 100的和
        /*int count = 0;
        for (int i = 1; i <= 100; i++) {
            count += i;
        }

        System.out.println("1.... 100的和:"+count);*/

        //需求2： 求1...5   阶乘
        /*int count1 = 1;
        for (int i = 1; i <= 5; i++) {
            count1 = count1*i;
        }
        System.out.println("1...5的阶乘:"+count1);*/

        int count = getcount(100);
        System.out.println("1.... 100的和:"+count);
    }

    private static int getcount(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            count += i;
        }
        return count;
    }

    private static void b(int i) {
        //当i的值为500的时候让循环停止
        //2.递归必需有条件限制，就是让递归能够停止下来，不然会报  Exception in thread "main" java.lang.StackOverflowError
		/*if(i==500){
			return;
		}*/
		if (i == 50000){
		    return;
        }
        System.out.println("i的值为：" + i);
		b(++i);
    }

    private static void a() {
        System.out.println("这是递归，是一个死循环");
        a();
    }
}
