package com.basics.functions;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 洛水晴川
 * @date 2021/4/26 11:48
 * */
public class MiniBwmCar extends BwmCar {

    private String limit;
    int a = 12;
    int b;

    public static void main(String[] args) {
        MiniBwmCar car = new MiniBwmCar();
        Set<String> s = new HashSet<>();
        s.add("abc");
        s.add("abc");
        s.add("ABC");
        s.add("abcd");
        System.out.println(s.size());
    }
}
