package com.basics.optionals;

import com.basics.model.Employee;
import org.junit.Test;

import java.util.Optional;

/**
 * @Author: xiaole.chen
 * @Date: 2019/10/27 11:56
 * @Description: 容器Optional类的常用方法
 * Optional.of(T t): 创建一个Optional实例
 * Optional.empty(): 创建一个空的Optional实例
 * Optional.ofNullable(T t): 若t不为null，则创建Optional实例，否则创建空的Optional实例
 * isPresent():判断是否包含值
 * orElse(T t): 如果调用对象包含值，则返回值，否则返回t
 * orElseGet(Supplier s): 如果调用对象包含值，返回该值，否则返回s 获取的值
 * map(Function f): 如果有值对其处理，并返回处理后的Optional，否则返回Optional.empty()
 * flatMap(Function mapper): 与map类似，返回值要求必须是Optional
 * */
public class OptionalTest {

    @Test
    public void test1() {
       Optional op = Optional.ofNullable(null);
        //System.out.println(op.orElse(null   ));
        System.out.println(op.orElseGet(() -> new Employee("李四", "重庆", 30 , "总经理", 50000L)));
    }

    @Test
    public void test2() {
        Optional<Employee> op = Optional.ofNullable(new Employee("张三", "深圳", 24, "技术部", 5000L));
        Optional<String> op2 = op.map(e -> e.getName());
        System.out.println(op2.get());
    }

    @Test
    public void test3() {
        Optional<Employee> op = Optional.ofNullable(new Employee("张三", "深圳", 24, "技术部", 5000L));
        Optional<String> mp = op.flatMap(e -> Optional.of(e.getName()));
        System.out.println(mp.get());
    }
}
