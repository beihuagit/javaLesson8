package com.basics.base.oop;

import java.math.BigDecimal;

/**
 * Java面向对象编程，基础知识
 * @author 洛水晴川
 * @date 2021/7/8 10:46
 * */
public class MainTest {

    public static void main(String[] args) {
        // java基本数据类型
        /*
            1. 整型：①字节型byte，②短整型short，③基本整型int，④长整型long
            2. 浮点型：①单精度浮点型：float，②双精度浮点型：double
            3. 字符型：char
            4. 布尔型：boolean

            精度大小关系：char<int<long<float<double
            低精度转高精度可以隐式转换，高精度转低精度则需要强转（会损失精度）
         */
        byte b = 5;
        short c = 6;
        int a = 7;
        long l = 8;
        // 高精度向低精度需要强转
        b = (byte) c;
        // 低精度向高精度可以隐式转换
        l = a;
        System.out.println(b);
        System.out.println(l);

        // 字符型能否转成整型，或浮点型呢？可以转换的，因为字符型对应值为1 —— 2^16(相当于整型)，但是转byte,short的时候照常要强转，因为是高精度向低精度转
        char r = '国';
        double e = 2;
        e = r;
        a = r;
        c = (short) a;
        b = (byte) a;
        System.out.println("a = " + a);

        /*
          以上是基于Java基本数据类型；然而Java还有对应的包装类型，也就是我们需要了解到的类型的“拆箱”和“装箱”机制；
          说明：基本数据类型向包装类型转换成为“装箱”，反之则称为“拆箱”，我们看以下示例：
         */

        int i = 10;
        Integer ii = 100;
        System.out.println(ii.intValue());

        Object i1 = 10;
        Integer i2 = 10;
        Integer i3 = 200;
        String i4 = "200";
        System.out.println(i1.equals(i2));
        System.out.println(i3.equals(i4));
        // 注意char的包装类是Character，而不是Char，其他基本都是单词大写
        /*
         * int -> Integer, short -> Short, long -> Long , byte -> Byte, float -> Float, double -> Double, boolean -> Boolean
         */
        Character chr = '中';
        char cha = '中';
        char cr = chr;

        // 如何解决浮点类型数据运算出现误差问题？（尽量使用BigDecimal进行浮点类型数据运算）
        BigDecimal bd = new BigDecimal(155.0096);
        double dt = 12.5;
        BigDecimal bd2 = bd.divide(new BigDecimal(12.56));
        System.out.println(bd2);


    }
}
