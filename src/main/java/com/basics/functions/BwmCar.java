package com.basics.functions;

/**
 * @author 洛水晴川
 * @date 2021/4/26 11:39
 * */
public class BwmCar extends Car {

    private String id;

    public static void main(String[] args) {
        BwmCar car = new BwmCar();
        Car temp = new BwmCar();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
