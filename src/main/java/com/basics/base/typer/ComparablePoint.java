package com.basics.base.typer;

/**
 * 给点类增加一个可以比较的“功能”，即实现比较接口即可
 * @author 洛水晴川
 * @date 2021/7/14 15:31
 * */
public class ComparablePoint extends Point implements MyComparable<ComparablePoint> {
    private int x;
    private int y;
    ComparablePoint(int x, int y) {
        super(x, y);
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(ComparablePoint other) {
        double delta = distance() - other.distance();
        if (delta < 0) {
            return -1;
        } else if (delta > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Point(x : " + x + ", y : " + y + ")";
    }
}
