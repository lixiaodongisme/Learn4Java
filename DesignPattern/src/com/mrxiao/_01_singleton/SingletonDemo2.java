package com.mrxiao._01_singleton;

/**
 * 懒汉式单例模式
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/22 11:07
 */
public class SingletonDemo2 {
   // 懒加载，只有使用到的时候才会创建对象
   private static SingletonDemo2 instance;

   private SingletonDemo2() {}

   // 方法同步，调用效率低
   public static synchronized SingletonDemo2 getInstance() {
      if (instance == null) {
         instance = new SingletonDemo2();
      }
      return instance;
   }
}
