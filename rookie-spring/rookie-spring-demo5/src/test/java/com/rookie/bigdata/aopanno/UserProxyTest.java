package com.rookie.bigdata.aopanno;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname UserProxyTest
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/22 15:21
 * @Version 1.0
 */
public class UserProxyTest {

    @Test
    public void testAopAnno() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

}