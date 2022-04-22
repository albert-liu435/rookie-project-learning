package com.rookie.bigdata.bootstrap;

import com.rookie.bigdata.domain.User;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

/**
 * @Classname Client
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/22 17:29
 * @Version 1.0
 */

public class Client {

    public static void main(String[] args) {
        //调用服务器地址,根据启动的服务器查看端口信息
        WebClient webClient = WebClient.create("http://127.0.0.1:55112");

        //根据id查询
        String id = "1";
        User userresult = webClient.get().uri("/users/{id}", id)
                .accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(User.class)
                .block();
        System.out.println(userresult.getName());

        //查询所有
        Flux<User> results = webClient.get().uri("/users")
                .accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(User.class);

        results.map(stu -> stu.getName())
                .buffer().doOnNext(System.out::println).blockFirst();
    }
}

