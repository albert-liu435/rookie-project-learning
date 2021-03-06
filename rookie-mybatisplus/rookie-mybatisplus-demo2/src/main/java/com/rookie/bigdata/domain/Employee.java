package com.rookie.bigdata.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * @Classname Employee
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/19 16:02
 * @Version 1.0
 */
/*
 * MybatisPlus会默认使用实体类的类名到数据中找对应的表.
 *
 */
public class Employee extends Model<Employee> {

    private Integer id ;   //  int
    private String  lastName;
    private String  email ;
    private Integer gender;
    private Integer age ;

    @TableField(exist=false)
    private Double salary ;

    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
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
    public Integer getGender() {
        return gender;
    }
    public void setGender(Integer gender) {
        this.gender = gender;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", lastName=" + lastName + ", email=" + email + ", gender=" + gender + ", age="
                + age + "]";
    }

    /**
     * 指定当前实体类的主键属性
     */
    @Override
    public Serializable pkVal() {
        return id;
    }


}