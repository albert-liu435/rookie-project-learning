package com.rookie.bigdata.domain;

import java.util.List;

/**
 * @Classname Department
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 10:10
 * @Version 1.0
 */
public class Department {

    private Integer id;
    private String departmentName;
    private List<Employee> emps;


    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department [id=" + id + ", departmentName=" + departmentName
                + "]";
    }


}
