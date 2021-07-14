package com.basics.data;

/**
 * @Author: xiaole.chen
 * @Date: 2020/1/15 14:09
 * @Description: 不同实现，结果一致
 * */
public class Triangle {

    public static int getTotalPoints(int n) {
        int totalPoints = 0;
        String points = "*";
        while (n > 0){
            System.out.println(points);
            points = points + " *";
            //System.out.println(n);
            totalPoints = totalPoints + n;
            n--;
        }
        return totalPoints;
    }

    public static int getPointsByRecression(int n){
        if(n == 1){
            return n;
        }else {
            return n + getPointsByRecression(n - 1);
        }
    }
}
