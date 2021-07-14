package com.basics.base.typer;

/**
 * 自定义一个“比较”接口: 比较两点的距离
 * 这里用到了泛型的概念，并且用到了泛型的“类型限定”，对参数类型作了限制，
 * 表示参数只能是Point或者Point的子类。
 * @author 洛水晴川
 * @date 2021/7/14 15:20
 * */
public interface MyComparable<T extends Point> {
    /**
     * 比较两点距离原点的大小
     * @param other
     * @return
     */
    int compareTo(T other);
}
