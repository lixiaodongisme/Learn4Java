package com.mrxiao._02_factory.factorymethod;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/22 15:38
 */
public class BenzFactory implements CarFactory {
   @Override
   public Car createCar() {
      return new Benz();
   }
}
