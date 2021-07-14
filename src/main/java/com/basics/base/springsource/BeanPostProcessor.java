package com.basics.base.springsource;

/**
 * @author 洛水晴川
 * @date 2021/4/14 19:03
 * */
public interface BeanPostProcessor {

    Object postProcessBeforeInitialization(Object bean, String beanName);

    Object postProcessAfterInitialization(Object bean, String beanName);
}
