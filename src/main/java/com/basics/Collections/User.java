package com.basics.Collections;

import java.io.Serializable;

/**
 * @author xiaole.chen
 * @date 2020/11/18 10:59
 * */
public class User implements Serializable {
    private static final long serialVersionUID = 1412162625975048286L;

    private String name;
    private int age;
    private String status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
