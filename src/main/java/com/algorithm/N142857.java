package com.algorithm;

import java.math.BigDecimal;

/**
 * 研究摩斯密码
 * 埃及金字塔密码：142857
 * 这是一组神奇的数字
 * @author 洛水晴川
 * @date 2021/8/9 10:03
 * */
public class N142857 {

    /**
     * 实验目的：通过将142857与任意自然数相乘的结果进行观察
     * 142857 x 1 = 142857
     * 142857 x 2 = 285714
     * 142857 x 3 = 428571
     * 142857 x 4 = 571428
     * 142857 x 5 = 714285
     * 142857 x 6 = 857142
     * 142857 x 7 = 999999
     * 142857 x 8 = 1142856
     * 142857 x 9 = 1285713
     * 142857 x 10 = 1428570
     */
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("请输入任意数字(输入0结束)：");
        //while (true) {
        //    int value = scanner.nextInt();
        //    if (value == 0) {
        //        break;
        //    }
        //    System.out.println("142857 x " + value + " = " + value * 142857);
        //}
        for (int i = 0; i < BigDecimal.TEN.intValue(); i++) {
            System.out.println("142857 x " + (i + 1) + " = " + 142857 * (i + 1));
        }
    }
}
