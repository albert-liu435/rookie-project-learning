package com.rookie.bigdata.service;

import com.rookie.bigdata.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @Classname UserServiceTest
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/22 14:52
 * @Version 1.0
 */
public class UserServiceTest {

    @Test
    public void testService2() {
        //加载配置类
        ApplicationContext context
                = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}