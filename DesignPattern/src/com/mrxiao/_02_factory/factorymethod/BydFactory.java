package com.mrxiao._02_factory.factorymethod;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/22 15:35
 */
public class BydFactory implements CarFactory {
   @Override
   public Car createCar() {
      return new Byd();
   }
}
