package com.mrxiao._02_factory.factorymethod;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/22 15:36
 */
public class Client {
   public static void main(String[] args) {
      Car c1 = new AudiFactory().createCar();
      Car c2 = new BydFactory().createCar();
      Car c3 = new BenzFactory().createCar();
      c1.run();
      c2.run();
      c3.run();
   }
}
