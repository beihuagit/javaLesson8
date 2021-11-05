package com.spring5.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * 多个后置处理器
 * @author 洛水晴川
 * @date 2021/9/23 11:52
 * */
public class UserEntityPostProcessor02 implements BeanPostProcessor, Ordered {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("[02]init方法调用前" + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("[02]init方法调用后" + beanName);
        return bean;
    }

    /**
     * 值越小越先执行
     * @return
     */
    @Override
    public int getOrder() {
        return 1;
    }
}
