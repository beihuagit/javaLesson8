package com.spring5.entity;

import java.util.Objects;

/**
 * @author 洛水晴川
 * @date 2021/9/23 11:19
 * */
public class UserEntity {

    private String userName;
    private Integer age;
    private String address;

    private DeptEntity deptEntity;

    public UserEntity() {
        System.out.println("第一步：调用默认构造方法，实例化bean");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("第二步：执行Setter方法给属性赋值");
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void init() {
        System.out.println("第三步：调用init()方法，初始化bean");
    }

    public void destroy() {
        System.out.println("第五步：调用destroy()方法，销毁bean");
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", deptEntity=" + deptEntity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserEntity that = (UserEntity) o;
        return Objects.equals(userName, that.userName) &&
                Objects.equals(age, that.age) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, age, address);
    }

    public void setDeptEntity(DeptEntity deptEntity) {
        this.deptEntity = deptEntity;
    }
}
