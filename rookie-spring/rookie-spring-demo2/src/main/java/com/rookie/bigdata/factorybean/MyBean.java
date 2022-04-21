package com.rookie.bigdata.factorybean;

import com.rookie.bigdata.domain.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Classname MyBean
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 17:02
 * @Version 1.0
 */
public class MyBean implements FactoryBean<Course> {

    //定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
