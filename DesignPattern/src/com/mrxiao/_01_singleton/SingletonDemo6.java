package com.mrxiao._01_singleton;

import java.io.Serializable;

/**
 * 懒汉式单例模式(如何防止反射与反序列化漏洞)
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/22 11:07
 */
public class SingletonDemo6 implements Serializable {
   private static SingletonDemo6 instance;

   private SingletonDemo6() {
      // 通过抛出异常来避免反射漏洞
      if (instance != null) {
         throw new RuntimeException();
      }
   }

   public static synchronized SingletonDemo6 getInstance() {
      if (instance == null) {
         instance = new SingletonDemo6();
      }
      return instance;
   }

   // 添加这个方法后，反序列时会自动调用这个方法，避免了反序列化漏洞
   public Object readResolve() {
      return instance;
   }
}
