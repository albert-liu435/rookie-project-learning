package com.rookie.bigdata.service;

import com.rookie.bigdata.domain.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @Classname UserServiceTest
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 16:52
 * @Version 1.0
 */
public class UserServiceTest {
    @Test
    public void testBean1() {
        //1 加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");

        //2 获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }

    @Test
    public void testBean2() {
        //1 加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");

        //2 获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        emp.add();
    }
}