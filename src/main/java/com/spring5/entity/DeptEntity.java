package com.spring5.entity;

/**
 * 部门
 * @author 洛水晴川
 * @date 2021/9/23 12:23
 * */
public class DeptEntity {
    private String deptName;
    private Long deptId;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public DeptEntity() {
    }

    @Override
    public String toString() {
        return "DeptEntity{" +
                "deptName='" + deptName + '\'' +
                ", deptId=" + deptId +
                '}';
    }
}
