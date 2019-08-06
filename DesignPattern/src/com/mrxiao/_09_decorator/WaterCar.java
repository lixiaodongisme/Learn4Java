package com.mrxiao._09_decorator;

/**
 * 具体装饰类
 *    它是抽象装饰类的子类，负责向构件添加新的职责。
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/29 17:09
 */
public class WaterCar extends CarDecorator {

   public WaterCar(ICar car) {
      super(car);
   }

   @Override
   public void movie() {
      super.movie();
      System.out.println("给车加上潜水的功能");
   }
}
