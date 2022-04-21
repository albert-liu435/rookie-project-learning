package com.rookie.bigdata.service;

import com.rookie.bigdata.dao.UserDao;

/**
 * @Classname UserService
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 16:49
 * @Version 1.0
 */
public class UserService {
    //创建UserDao类型属性，生成set方法
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add...............");
        userDao.update();
    }
}

