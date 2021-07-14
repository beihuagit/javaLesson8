package com.basics.data;

/**
 * @Author: xiaole.chen
 * @Date: 2020/1/15 15:12
 * @Description:
 * */
public class TestFibonnacci {

    public static int getNumber(int n){
        if(n == 1){
            return 0;
        }else if(n == 2){
            return 1;
        }else{
            return getNumber(n - 1) + getNumber(n - 2);
        }

    }
}
