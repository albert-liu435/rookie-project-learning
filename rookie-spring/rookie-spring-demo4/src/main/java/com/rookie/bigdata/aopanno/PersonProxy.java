package com.rookie.bigdata.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Classname PersonProxy
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/22 15:11
 * @Version 1.0
 */
@Component
@Aspect
@Order(1)
public class PersonProxy {
    //后置通知（返回通知）
    @Before(value = "execution(* com.rookie.bigdata.aopanno.User.add(..))")
    public void afterReturning() {
        System.out.println("Person Before.........");
    }
}