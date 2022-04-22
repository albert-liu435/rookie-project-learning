package com.rookie.bigdata.reactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Classname TestReactor
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/22 15:55
 * @Version 1.0
 */
public class TestReactor {

    public static void main(String[] args) {

//        //just方法直接声明
//        Flux.just(1, 2, 3, 4);
//        Mono.just(1);
//        //其他方法
//        Integer[] array = {1, 2, 3, 4};
//        Flux.fromArray(array);
//
//        List<Integer> list = Arrays.asList(array);
//        Flux.fromIterable(list);
//
//        Stream<Integer> stream = list.stream();
//        Flux.fromStream(stream);

        Flux<Integer> just = Flux.just(1, 2, 3, 4);
        just.subscribe(System.out::print);
        Mono.just(1).subscribe(System.out::print);

    }
}
