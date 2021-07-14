package com.basics.base.typer;

/**
 * 类：点
 * 属性：x坐标，y坐标
 * 方法：可以计算点与点之间的距离
 * 两点间的距离公式：|X1 - X2|的平方 + |Y1 - Y2|的平方；
 * 由此可得P(x,y)到原点的距离公式是：Math.sqrt(x * x + y * y)
 * @author 洛水晴川
 * @date 2021/7/14 15:22
 * */
public class Point {

    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    /**
     * 坐标点到原点的距离
     * @return double
     */
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
}
