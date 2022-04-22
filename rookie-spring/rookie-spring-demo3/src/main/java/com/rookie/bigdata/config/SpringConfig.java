package com.rookie.bigdata.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname SpringConfig
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/22 14:50
 * @Version 1.0
 */
@Configuration  //作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.rookie.bigdata"})
public class SpringConfig {

}