package com.basics.lambda.methodref;

import com.basics.model.Employee;
import org.junit.Test;

import java.util.function.*;

/**
 * 结合前面所学的Java8提供的几个常用的函数式接口
 * 一、方法引用：若lambda体中的内容有方法已经实现了，我们可以使用“方法引用”
 * （可以理解为：方法引用是lambda表达式的另一种表现形式）
 *  主要有三种语法格式：
 *      对象 :: 实例方法名
 *      类 :: 静态方法名
 *      类 :: 实例方法名
 * 二、构造器引用
 * 三、数组引用
 * @author 洛水晴川
 * @date 2021/7/10 12:19
 * */
public class TestMethodRef {

    @Test
    public void test1(){
        Consumer<String> con = System.out::println;
        con.accept("hello world!");
    }

    @Test
    public void test2(){
        Employee employee = new Employee();
        employee.setName("小乐");
        Supplier<String> sp = employee::getName;
        System.out.println(sp.get());
    }

    @Test
    public void test3(){
        BiPredicate<String, String> bp = String::equals;
        boolean test = bp.test("hello", "hello");
        System.out.println(test);
    }

    /**
     * 测试构造器引用
     */

    @Test
    public void test5(){
        // 构造器引用的入参类型必须同对象的构造方法的参数类型和个数一致
        /*
           无参构造器
         */
        Supplier<Employee> sup = Employee::new;
        Employee ep = sup.get();
        System.out.println(ep);
        /*
           单个参数
         */
        Function<Integer, Employee> emp = Employee::new;
        Employee employee = emp.apply(28);
        System.out.println(employee);

        /*
           多个参数
         */
        BiFunction<Integer, String, Employee> emp2 = Employee::new;
        Employee employee2 = emp2.apply(30, "小乐");
        System.out.println(employee2);



    }

    /**
     * 数组引用
     */
    @Test
    public void test6() {
        Function<Integer, String[]> arr = String[]::new;
        String[] str = arr.apply(20);
        System.out.println(str.length);
    }
}
