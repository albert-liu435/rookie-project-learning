package com.rookie.bigdata.aopanno;

import org.springframework.stereotype.Component;

/**
 * @Classname User
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/22 15:11
 * @Version 1.0
 */

//被增强的类
@Component
public class User {
    public void add() {
        int i = 10/0;
        System.out.println("add.......");
    }
}

