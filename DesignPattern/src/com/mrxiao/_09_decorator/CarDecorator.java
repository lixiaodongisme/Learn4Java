package com.mrxiao._09_decorator;

/**
 * 抽象装饰类
 *    它也是抽象构件类的子类，用于给具体构件增加职责，但是具体职责在其子类中实现
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/29 17:05
 */
public class CarDecorator implements ICar {
   protected ICar car;

   public CarDecorator(ICar car) {
      this.car = car;
   }

   @Override
   public void movie() {
      car.movie();
   }
}
