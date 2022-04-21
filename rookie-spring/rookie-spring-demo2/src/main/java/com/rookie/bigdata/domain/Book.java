package com.rookie.bigdata.domain;

import java.util.List;

/**
 * @Classname Book
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 16:43
 * @Version 1.0
 */
public class Book {
    private List<String> list;
    public void setList(List<String> list) {
        this.list = list;
    }

    public void test() {
        System.out.println(list);
    }
}

