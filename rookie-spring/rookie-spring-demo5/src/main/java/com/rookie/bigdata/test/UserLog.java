package com.rookie.bigdata.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Classname UserLog
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/22 15:41
 * @Version 1.0
 */
public class UserLog {

    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {

        log.info("hello log4j2");
        log.warn("hello log4j2");
    }
}
