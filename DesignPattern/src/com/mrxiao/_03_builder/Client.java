package com.mrxiao._03_builder;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/23 11:01
 */
public class Client {
   public static void main(String[] args) {
      AirshipBuilder builder = new NO1AirshipBuilder();
      AirshipDirector director = new NO1AirshipDirector(builder);

      AirShip airShip = director.createNo1AirShip();
      airShip.run();
   }
}
