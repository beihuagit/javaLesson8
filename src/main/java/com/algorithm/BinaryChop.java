package com.algorithm;

import java.util.Scanner;

/**
 * 二分查找（折半查找，比较次数少，查找速度快，但是待查找的表是有序的，插入困难，适应于不经常变动）
 * @author 洛水晴川
 * @date 2021/3/27 13:00
 * */
public class BinaryChop {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int start = 0, end = nums.length - 1, mid, find;
        System.out.println("请输入你要找的数：");
        Scanner input = new Scanner(System.in);
        find = input.nextInt();
        do {
            mid = (start + end) / 2;
            if (find == nums[mid]) {
                System.out.println("查找成功！");
                break;
            } else if (find > nums[mid]) {
                start = mid + 1;
            } else if (find < nums[mid]) {
                end = mid - 1;
            }
        } while (start <= end);
        System.out.println(String.format("程序结束！start=%d,end=%s,mid=%d",start,end,mid));
    }
}
