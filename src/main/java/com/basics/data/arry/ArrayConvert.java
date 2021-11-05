package com.basics.data.arry;

import java.util.Arrays;

/**
 * 数组反转
 * @author 洛水晴川
 * @date 2021/9/24 11:48
 * */
public class ArrayConvert {
    public static void main(String[] args) {
        int[] array = {92, 22, 36, 50, 67, 80};
        for (int start = 0, end = array.length - 1; start <= end; start++, end--) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
