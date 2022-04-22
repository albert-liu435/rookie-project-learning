package com.rookie.bigdata.service;

import com.rookie.bigdata.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @Classname UserService
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/22 17:23
 * @Version 1.0
 */
//用户操作接口
public interface UserService {
    //根据id查询用户
    Mono<User> getUserById(int id);

    //查询所有用户
    Flux<User> getAllUser();

    //添加用户
    Mono<Void> saveUserInfo(Mono<User> user);
}
