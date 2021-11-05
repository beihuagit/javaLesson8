package com.design.builder;

import java.util.List;

/**
 * 车模建造者
 * @author 洛水晴川
 * @date 2021/7/28 16:19
 * */
public abstract class CarBuilder {

    /**
     * 车辆运行的顺序
     */
    public abstract void setSequence(List<String> sequence);

    /**
     * 设置完顺序直接得到车模
     * @return
     */
    public abstract CarModel getCarModel();
}
