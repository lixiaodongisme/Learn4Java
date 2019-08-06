package com.mrxiao._02_factory.simplefactory;

/**
 * 简单工厂模式
 *    拓展性差，无法支持新增加的产品
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/22 15:07
 */
public class CarFactory {
   // 第一种写法
   public static Car createCar(String type) {
      if ("奥迪".equals(type)) {
         return new Audi();
      } else {
         return new Byd();
      }
   }

   // 第二种写法
   public static Car createAudi() {
      return new Audi();
   }

   public static Car createByd() {
      return new Byd();
   }
}
