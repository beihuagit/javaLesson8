package com.basics.data.arry;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

/**
 * 数组练习：选手打分
 * @author 洛水晴川
 * @date 2021/9/24 11:05
 * */
public class ArrayScores {
    public static void main(String[] args) {
        int[] array = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分：");
            array[i] = scanner.nextInt();
        }
        System.out.println("评委们的打分情况：" + Arrays.toString(array));
        int max = getMax(array);
        System.out.println("最高分是：" + max);
        int min = getMin(array);
        System.out.println("最低分是：" + min);
        int sum = getSum(array);
        System.out.println("总分是：" + sum);
        //选手得分： 减掉一个最高分，减掉一个最低分，计算平均分
        int score = (sum - max - min) / (array.length - 2);
        System.out.println("选手得分：" + score);
    }

    private static int getSum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    private static int getMax(int[] array) {
        OptionalInt max = Arrays.stream(array).max();
        return max.getAsInt();
    }

    private static int getMin(int[] array) {
        // 假设数组中第一个元素是最小值，依次与数组中其他元素必较
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        return min;
    }
}
