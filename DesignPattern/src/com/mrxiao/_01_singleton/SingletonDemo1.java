package com.mrxiao._01_singleton;

/**
 * 饿汉式单例模式
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/22 11:07
 */
public class SingletonDemo1 {
   // 加载类时立即加载对象（无法延迟加载），类的加载机制保证了线程安全
   private static SingletonDemo1 instance = new SingletonDemo1();

   private SingletonDemo1(){}

   // 没有使用同步方法，调用效率高
   public static SingletonDemo1 getInstance() {
      return instance;
   }
}
