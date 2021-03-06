package com.rookie.bigdata.domain;


import org.apache.ibatis.type.Alias;

/**
 * @Classname Employee
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/19 16:02
 * @Version 1.0
 */

@Alias("emp")
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private String gender;
    private Department dept;

    public Employee() {
        super();
    }

    public Employee(Integer id, String lastName, String email, String gender) {
        super();
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }


    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", lastName=" + lastName + ", email="
                + email + ", gender=" + gender + "]";
    }


}
