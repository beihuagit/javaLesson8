package com.basics.base.typer;

import java.util.Arrays;

/**
 * 选择排序
 * @author 洛水晴川
 * @date 2021/7/14 17:52
 * */
public class Test {
    public static void main(String[] args) {
        int[] a = {0, 1, 3, 9, 6};
        System.out.println("初始数组：" + Arrays.toString(a));
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    // 小的往前排
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("排序过后：" + Arrays.toString(a));
    }
}
