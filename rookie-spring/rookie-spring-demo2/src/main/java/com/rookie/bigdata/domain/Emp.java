package com.rookie.bigdata.domain;

/**
 * @Classname Emp
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 17:06
 * @Version 1.0
 */

public class Emp {
    private Dept dept;
    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test() {
        System.out.println(dept);
    }
}
