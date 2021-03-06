package com.rookie.bigdata.domain;


import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname BookTest
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 16:45
 * @Version 1.0
 */
public class BookTest {

    @Test
    public void testUser() {
        //1 加载spring配置文件
        BeanFactory context =
                new ClassPathXmlApplicationContext("bean1.xml");

        //2 获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook1() {
        //1 加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        //2 获取配置创建的对象
        Book book = context.getBean("book", Book.class);

        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrders() {
        //1 加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        //2 获取配置创建的对象
        Orders orders = context.getBean("orders", Orders.class);

        System.out.println(orders);
        orders.ordersTest();
    }

}