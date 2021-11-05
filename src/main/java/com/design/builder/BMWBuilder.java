package com.design.builder;

import java.util.List;

/**
 * @author 洛水晴川
 * @date 2021/7/28 16:24
 * */
public class BMWBuilder extends CarBuilder {

    private static final BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequence(List<String> sequence) {
        bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return bmwModel;
    }
}
