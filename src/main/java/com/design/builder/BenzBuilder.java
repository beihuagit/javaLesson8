package com.design.builder;

import java.util.List;

/**
 * @author 洛水晴川
 * @date 2021/7/28 16:22
 * */
public class BenzBuilder extends CarBuilder {

    private static final BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(List<String> sequence) {
        // 具体的业务逻辑
        benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return benzModel;
    }
}
