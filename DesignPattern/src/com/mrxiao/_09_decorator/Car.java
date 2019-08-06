package com.mrxiao._09_decorator;

/**
 * 具体构件
 *    它是抽象构件类的子类，用于定义具体的构件对象，实现了在抽象构件中声明的方法，装饰器可以给它增加额外的职责
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/29 17:03
 */
public class Car implements ICar{

   @Override
   public void movie() {
      System.out.println("汽车的基本功能,在地上跑");
   }
}
