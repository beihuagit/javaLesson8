package com.basics.lambda;

import com.basics.model.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @Author: xiaole.chen
 * @Date: 2019/10/27 13:12
 * @Description: lambda编程
 * */
public class LambdaTest {


    List<Employee> list = new ArrayList<Employee>(){{
        add(new Employee("张三", "深圳", 28 , "市场部", 8000L));
        add(new Employee("李丽", "深圳", 28 , "市场部", 8000L));
        add(new Employee("王燕", "深圳", 26 , "市场部", 7000L));
        add(new Employee("石头", "深圳", 29 , "技术部", 15000L));
        add(new Employee("张大力", "武汉", 37 , "技术部", 16000L));
        add(new Employee("陈辉", "重庆", 36 , "公关部", 18000L));
    }};

    @Test
    public void test1(){

        // 匿名内部类
        Comparator<Integer> comparator = Integer::compare;

        TreeSet<Integer> set = new TreeSet<>(comparator);
    }

    @Test
    public void test2() {
        // lambda表达式
        Comparator<Integer> comparator = Integer::compare;

        Comparator<Integer> comparator1 = Integer::compare;

        Comparator<Integer> comparator2 = Comparator.comparingInt(o -> o);

        TreeSet<Integer> set = new TreeSet<>(comparator2);
        list.forEach(e -> list.forEach(d -> {
            int a = comparator2.compare(e.getAge(), d.getAge());
            //System.out.println(a);
        if(a > 0){
            System.out.println(d.getAge());
        }
        }));
    }

    // 需求一： 获取公司中年龄大于35岁的员工
    @Test
    public void test3(){
        list = list.stream().filter(e -> e.getAge() > 35).collect(Collectors.toList());
        list.forEach(e -> System.out.println(e.getName()));
    }

    // 需求二：获取工资大于5000的员工
    @Test
    public void test4(){
        //filterEmployee(list, employee -> employee.getSalary() >= 5000);
        List<Employee> lists = filterEmployee(list, new FilterEmployeeBySalary());
        for(Employee employee : lists){
            System.out.println(employee);
        }
    }

    public List<Employee> filterEmployee(List<Employee> list, MyPredicate<Employee> mp) {

        List<Employee> result = new ArrayList<>();
        for (Employee employee : list) {
            if (mp.test(employee)) {
                result.add(employee);
            }
        }
        return result;
    }
}
