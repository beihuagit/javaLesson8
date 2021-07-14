package com.basics.model;

import lombok.*;

import java.io.Serializable;

/**
 * @Author: xiaole.chen
 * @Date: 2019/10/27 12:10
 * @Description:
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Employee implements Serializable {

    private static final long serialVersionUID = -9109298799959074770L;

    private String name;
    private String location;
    private Integer age;
    private String department;

    private Long salary;

    public Employee(Integer age) {
        this.age = age;
    }

    public Employee(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
}
