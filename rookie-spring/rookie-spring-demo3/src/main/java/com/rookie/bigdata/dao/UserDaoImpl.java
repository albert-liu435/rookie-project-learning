package com.rookie.bigdata.dao;

import org.springframework.stereotype.Repository;

/**
 * @Classname UserDaoImpl
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 16:49
 * @Version 1.0
 */
@Repository(value = "userDaoImpl")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao add.....");
    }
}
