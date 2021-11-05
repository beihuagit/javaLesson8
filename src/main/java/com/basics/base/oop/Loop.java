package com.basics.base.oop;

import java.util.ArrayList;
import java.util.List;

/**
 * 循环语句
 * @author 洛水晴川
 * @date 2021/10/14 16:26
 * */
public class Loop {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>() {
            private static final long serialVersionUID = -7401040249775586103L;

            {
                add("sexy");
                add("hello");
                add("123");
                add("中国");
                add("love");
            }
        };

        // while 循环控制语句
        int size = list.size();
        while (size > 0) {
            size--;
            System.out.println(list.get(size));
        }
    }

}
