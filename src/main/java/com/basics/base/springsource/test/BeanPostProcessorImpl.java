package com.basics.base.springsource.test;

import com.basics.base.springsource.BeanPostProcessor;
import com.basics.base.springsource.Component;

/**
 * @author 洛水晴川
 * @date 2021/4/14 19:09
 * */
@Component
public class BeanPostProcessorImpl implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("bean 初始化开始......");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {

        // 此处即是AOP代理实现的地方
        System.out.println("bean 初始化结束......");
        return bean;
    }
}
