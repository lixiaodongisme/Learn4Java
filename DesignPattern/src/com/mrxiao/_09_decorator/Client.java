package com.mrxiao._09_decorator;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/29 17:11
 */
public class Client {
   public static void main(String[] args) {
      ICar car = new Car();

      System.out.println("------给车添加飞行的功能------");
      ICar flyCar = new FlyCar(car);
      flyCar.movie();

      System.out.println("------给车添加自动驾驶和潜水的功能------");
      ICar superCar = new AICar(new WaterCar(car));
      superCar.movie();
   }
}
