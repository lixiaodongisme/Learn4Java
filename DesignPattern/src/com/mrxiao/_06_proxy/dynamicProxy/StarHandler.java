package com.mrxiao._06_proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 *      使用jdk原生方法实现动态代理
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/25 16:03
 */
public class StarHandler implements InvocationHandler {

    private Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置处理,比如面谈,签合同...");
        if (method.getName().equals("sing")) {
            method.invoke(realStar, args);
        }
        System.out.println("后置处理,比如收款...");
        return null;
    }
}
