package com.basics.base.typer;

import java.util.Arrays;

/**
 * @author 洛水晴川
 * @date 2021/7/14 16:01
 * */
public class Main {
    public static void main(String[] args) {
        ComparablePoint point1 = new ComparablePoint(15, 20);
        ComparablePoint point2 = new ComparablePoint(15, 25);
        ComparablePoint point3 = new ComparablePoint(18, 18);
        int delta = point2.compareTo(point1);
        // 结果大于1，说明point2到原点的距离大于point1到原点的距离
        System.out.println(delta);
        // 那么两点各自到原点的距离是多少呢？
        System.out.println(point1.toString() + "-point1 到原点的距离是：" + point1.distance());
        System.out.println(point2.toString() + "-point2 到原点的距离是：" + point2.distance());
        System.out.println(point3.toString() + "-point3 到原点的距离是：" + point3.distance());
        MyComparable<ComparablePoint>[] list = new ComparablePoint[]{
                point1, point2, point3
        };
        System.out.println("到原点距离最远的坐标点是：" + CompareUtil.max(list).toString());
        CompareUtil.sort(list);
        System.out.println("按坐标到原点的距离大小排序：" + Arrays.toString(list));
    }
}
