package com.basics.annotation;

import java.lang.annotation.Annotation;
import java.util.Arrays;

/**
 * 结论：类的继承关系中，子类会继承父类的注解（父类所用注解中有被@Inherited注解修饰）；
 *      接口的继承不存在注解继承；
 *      类实现接口也不存在注解继承
 * 测试@Inherited注解的作用
 * @author xiaole.chen
 * @date 2021/11/3 16:31
 * */
public class Test {

    public static void main(String[] args) {

        Annotation[] annotations = InheritedChild.class.getAnnotations();
        System.out.println("是否存在@Inherited注解：" + Arrays.stream(annotations).anyMatch(a -> a.annotationType().equals(InheritedAnnotation.class)));
        System.out.println("是否存在@Inherited注解：" + Arrays.stream(annotations).anyMatch(a -> a.annotationType().equals(NoInheritedAnnotation.class)));

        Annotation[] annotations1 = MyIInheritedInterface.class.getAnnotations();
        System.out.println("1 " + Arrays.stream(annotations1).anyMatch(a -> a.annotationType().equals(InheritedAnnotation.class)));
        System.out.println("2 " + Arrays.stream(annotations1).anyMatch(a -> a.annotationType().equals(NoInheritedAnnotation.class)));

        Annotation[] annotations2 = InheritedInterfaceChild.class.getAnnotations();
        System.out.println("3 " + Arrays.stream(annotations2).anyMatch(a -> a.annotationType().equals(InheritedAnnotation.class)));
        System.out.println("4 " + Arrays.stream(annotations2).anyMatch(a -> a.annotationType().equals(NoInheritedAnnotation.class)));
    }
}
