package com.basics.lambda;

import com.basics.model.Employee;

/**
 * @Author: xiaole.chen
 * @Date: 2019/10/28 11:08
 * @Description:
 * */
public class FilterEmployeeBySalary implements MyPredicate<Employee> {

    @Override
    public boolean test(Employee employee) {
        //employee.getSalary() > 8000;
        return true;
    }
}
