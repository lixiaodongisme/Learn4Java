package com.mrxiao._01_singleton;

/**
 * 静态内部类实现单例模式
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/22 13:25
 */
public class SingletonDemo4 {
   private static class SingletonInstanceClass {
      private static final SingletonDemo4 instance = new SingletonDemo4();
   }

   private SingletonDemo4() {}

   public static SingletonDemo4 getInstance() {
      return SingletonInstanceClass.instance;
   }
}
