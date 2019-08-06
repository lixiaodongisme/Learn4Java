package com.mrxiao._01_singleton;

/**
 * 单例模式之双重检查锁
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/22 13:20
 */
public class SingletonDemo3 {
   private static SingletonDemo3 instance;

   private SingletonDemo3() {
   }

   // 实现了懒加载，并且不会每次调用方法时同步，效率高，但是由于JVM模型的原因，某些特殊情况下可能会出问题
   public static SingletonDemo3 getInstance() {
      if (instance == null) {
         synchronized(SingletonDemo3.class) {
            if (instance == null) {
               instance = new SingletonDemo3();
            }
         }
      }
      return instance;
   }
}
