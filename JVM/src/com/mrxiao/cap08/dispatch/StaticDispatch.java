package com.mrxiao.cap08.dispatch;

/**
 * 方法静态分派演示
 * @Author: lixiaodongisme@163.com
 * @Date: Created in 18:28 2019/1/27
 */
public class StaticDispatch {
    static abstract class Human{
    }

    static class Man extends Human {
    }

    static class Woman extends Human{
    }

    public void sayHello(Human guy) {
        System.out.println("Hello, guy!");
    }

    public void sayHello(Man guy) {
        System.out.println("Hello, gentleman!");
    }

    public void sayHello(Woman guy) {
        System.out.println("Hello, lady!");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        StaticDispatch sd = new StaticDispatch();

        // 以下语句执行后输出的结果是什么?
        sd.sayHello(man);
        sd.sayHello(woman);
    }
}
