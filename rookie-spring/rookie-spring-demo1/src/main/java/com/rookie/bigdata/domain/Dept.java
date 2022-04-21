package com.rookie.bigdata.domain;

/**
 * @Classname Dept
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 16:51
 * @Version 1.0
 */
public class Dept {
    private String dname;
    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
