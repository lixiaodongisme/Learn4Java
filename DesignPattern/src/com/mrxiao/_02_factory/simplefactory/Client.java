package com.mrxiao._02_factory.simplefactory;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/22 15:09
 */
public class Client {
   public static void main(String[] args) {
      Car audi = CarFactory.createCar("奥迪");
      Car byd = CarFactory.createCar("比亚迪");
      audi.run();
      byd.run();
   }
}
