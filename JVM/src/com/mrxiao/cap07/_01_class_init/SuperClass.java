package com.mrxiao.cap07._01_class_init;

/*
* 虚拟机规范严格规定了有且只有四种主动引用一个类时，才会对这个类初始化
*
*     被动使用类字段演示：
*        通过子类引用父类的静态字段，不会导致子类初始化
* */
public class SuperClass {
   static {
      System.out.println("SuperClass init");
   }

   public static int value = 123;

   public static final String HELLO_WORLD = "hello world";
}
