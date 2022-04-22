package com.rookie.bigdata.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Classname SpringConfig
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/22 14:50
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = {"com.rookie.bigdata"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
