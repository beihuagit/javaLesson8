package com.algorithm;

import java.util.Arrays;

/**
 * 冒泡排序：相邻比较，小的向前移，大的向后移
 * @author 洛水晴川
 * @date 2021/3/27 13:27
 * */
public class BulbbleSort {

    public static void main(String[] args) {
        int[] nums = {8, 9, 7, 4, 5, 6, 1, 2, 3};
        // 让第i个数和后面的数比较，如果后面的数比较小，则与i换位置
        for (int i = 0; i < nums.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
