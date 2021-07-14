package com.basics.Collections;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xiaole.chen
 * @date 2020/11/18 10:59
 * */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1412162625975048286L;

    private String name;
    private int age;
    private String status;
}
