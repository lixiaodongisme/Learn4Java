package com.mrxiao._01_singleton;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/22 13:42
 */
public class Client {
   public static void main(String[] args) {
      System.out.println(SingletonDemo1.getInstance() == SingletonDemo1.getInstance());
      System.out.println(SingletonDemo2.getInstance() == SingletonDemo2.getInstance());
      System.out.println(SingletonDemo3.getInstance() == SingletonDemo3.getInstance());
      System.out.println(SingletonDemo4.getInstance() == SingletonDemo4.getInstance());
      System.out.println(SingletonDemo5.INSTANCE == SingletonDemo5.INSTANCE);
   }
}
