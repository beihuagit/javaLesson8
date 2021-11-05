package com.spring5.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author xiaole.chen
 * @date 2021/10/26 14:59
 * */
@Component
public class MyStaticBeanAware implements ApplicationContextAware {

    public static ApplicationContext appContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        appContext = applicationContext;
    }

    public static <T>T getBean(Class<T> clazz) {
        return clazz == null ? null : appContext.getBean(clazz);
    }
}
