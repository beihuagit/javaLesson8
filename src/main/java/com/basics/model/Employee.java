package com.basics.model;

import java.io.Serializable;

/**
 * @Author: xiaole.chen
 * @Date: 2019/10/27 12:10
 * @Description:
 * */

public class Employee implements Serializable {

    private static final long serialVersionUID = -9109298799959074770L;

    private String name;
    private String location;
    private Integer age;
    private String department;
    private Long salary;

    public Employee() {
    }

    public Employee(String name, String location, Integer age, String department, Long salary) {
        this.name = name;
        this.location = location;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public Employee(Integer age) {
        this.age = age;
    }

    public Employee(Integer age, String name) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
