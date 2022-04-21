package com.rookie.bigdata.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @Classname Department
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 15:48
 * @Version 1.0
 */
public class Department implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String departmentName;
    private List<Employee> emps;


    public Department(Integer id) {
        super();
        this.id = id;
    }

    public Department() {
        super();
        // TODO Auto-generated constructor stub
    }

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

