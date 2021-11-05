package com.basics.data;

/**
 * 水仙花数：三位数，个位，十位，百位各个数的立方和是这个数本身
 * @author 洛水晴川
 * @date 2021/9/24 10:08
 * */
public class ShuiXianHuaTest {
    public static void main(String[] args) {
        //for (int i = 100; i <= 999; i++) {
        //    int g = i % 10;
        //    int s = i / 10 % 10;
        //    int b = i / 100;
        //    if (g * g * g + s * s * s + b * b * b == i) {
        //        System.out.println("水仙花数：" + i);
        //    }
        //}

        int i = 100;
        while (i <= 999) {
            int g = i % 10;
            int s = i / 10 % 10;
            int b = i / 100;
            if (g * g * g + s * s * s + b * b * b == i) {
                System.out.println("水仙花数：" + i);
            }
            i++;
        }

        /**
         *
         * 珠穆朗玛峰的高度叠纸叠多少次
         */
        // 珠穆朗玛峰的高度
        int j = 8844430;
        // 纸张厚度
        double h = 0.1;
        // 叠的次数
        int count = 0;
        while (h <= j) {
            h = h * 2;
            count++;
        }
        System.out.println(count);
        System.out.println(h);


        /**
         * do ... while 循环
         */
        int m = 0;
        do {
            System.out.println("洛水晴川");
            m++;
        } while (m < 5);

        int n = 0;
        while (n < 5) {
            System.out.println("中国");
            n++;
        }

        int k = 0;
        for (; k < 5; ){
            System.out.println("科技");
            k++;
        }
        System.out.println(k);

        //for(;;) {
        //    System.out.println("死循环");
        //}
        //while(true){
        //    System.out.println("死循环");
        //}
        //do {
        //    System.out.println("死循环");
        //} while (true);
    }

}
