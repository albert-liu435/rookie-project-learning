//package com.rookie.bigdata.aopxml;
//
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//
///**
// * @Classname BookProxyTest
// * @Description TODO
// * @Author rookie
// * @Date 2022/4/22 15:26
// * @Version 1.0
// */
//public class BookProxyTest {
//
//    @Test
//    public void testAopXml() {
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("bean2.xml");
//        Book book = context.getBean("book", Book.class);
//        book.buy();
//    }
//
//}