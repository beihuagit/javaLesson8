package com.basics.annotation;

import java.lang.annotation.*;

/**
 * 继承元注解
 * @author xiaole.chen
 * @date 2021/11/3 16:23
 * */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface InheritedAnnotation {
}
