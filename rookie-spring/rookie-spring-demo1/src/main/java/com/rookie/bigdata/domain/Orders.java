package com.rookie.bigdata.domain;

/**
 * @Classname Orders
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 16:44
 * @Version 1.0
 */
public class Orders {
    //属性
    private String oname="";
    private String address;
    //有参数构造
    public Orders(String oname,String address) {
        this.oname = oname;
        this.address = address;
    }

    public void ordersTest() {
        System.out.println(oname+"::"+address);
    }
}
