package com.basics.base.typer;

/**
 * 1.比较多个点到坐标原点的距离，找出最大的；
 * 2.多个点到坐标原点的距离按大小顺序排列（选择排序）
 * @author 洛水晴川
 * @date 2021/7/14 17:00
 * */
public class CompareUtil {

    public static MyComparable<ComparablePoint> max(MyComparable<ComparablePoint>[] o) {
        if (o == null || o.length == 0) {
            return null;
        }
        MyComparable<ComparablePoint> max = o[0];
        for (int i = 1; i < o.length; i++) {
            if (max.compareTo((ComparablePoint) o[i]) < 0) {
                max = o[i];
            }
        }
        return max;
    }

    public static void sort(MyComparable<ComparablePoint>[] o) {
        MyComparable<ComparablePoint> temp;
        for (int i = 0; i < o.length; i++) {
            for (int j = i + 1; j < o.length; j++) {
                if (o[j].compareTo((ComparablePoint) o[i]) < 0) {
                    temp = o[i];
                    o[i] = o[j];
                    o[j] = temp;
                }
            }
        }
    }
}
