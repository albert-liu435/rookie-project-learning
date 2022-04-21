package com.rookie.bigdata.domain;

/**
 * @Classname Course
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 16:58
 * @Version 1.0
 */
public class Course {
    private String cname; //课程名称
    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
