package com.basics.functions;

/**
 * @author 洛水晴川
 * @date 2021/4/26 11:28
 * */
public class Car {

    private static final String TAG = "BWM";
    private String carName;
    private String carNumber;

    String Car(){return null;}
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    private abstract class Bmw {

        public void test(){
            Car car = new Car();
            car.carName = "tttt";
            System.out.println(Car.TAG);
        }

        public abstract void gob();
    }

    public static void main(String[] args) {
        String carName = "xiaole";
        System.out.println(carName);
    }

    private Car createCar(String carName) {
        return new Car();
    }
}
