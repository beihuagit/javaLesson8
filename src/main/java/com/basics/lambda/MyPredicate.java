package com.basics.lambda;

/**
 * @Author: xiaole.chen
 * @Date: 2019/10/28 11:06
 * @Description: 策略设计模式
 * */
public interface MyPredicate<T> {

    boolean test(T t) ;
}
