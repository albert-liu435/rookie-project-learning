package com.rookie.bigdata.reactor;

import org.junit.Test;
import reactor.core.publisher.Flux;

import java.util.function.Function;

/**
 * @Classname DemoFlux
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/22 16:33
 * @Version 1.0
 */
public class DemoFlux {


    @Test
    public void fluxMap() {
        //相当于对每个值前面添加#  下面的两个效果是一样的，其实就是java的函数式编程
        Flux.just(1, 2, 3, 4).map(n -> "#" + n).subscribe(System.out::println);
        Flux.just(1, 2, 3, 4).map(new Function<Integer, String>() {

            @Override
            public String apply(Integer integer) {

                return "#" + integer;
            }
        }).subscribe(System.out::println);
    }


    @Test
    public void FluxRange(){
        Flux.range(1, 10).subscribe(System.out::println);
    }

}
