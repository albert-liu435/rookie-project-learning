package com.rookie.bigdata.reactor;

import java.util.Observable;

/**
 * @Classname ObserverDemo
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/22 15:52
 * @Version 1.0
 */
public class ObserverDemo extends Observable {

    public static void main(String[] args) {
        ObserverDemo observer = new ObserverDemo();
        //添加观察者
        observer.addObserver((o,arg)->{
            System.out.println("发生变化");
        });
        observer.addObserver((o,arg)->{
            System.out.println("手动被观察者通知，准备改变");
        });
        observer.setChanged(); //数据变化
        observer.notifyObservers(); //通知
    }
}
