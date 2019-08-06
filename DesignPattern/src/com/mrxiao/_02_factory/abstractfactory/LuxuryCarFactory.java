package com.mrxiao._02_factory.abstractfactory;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/22 16:24
 */
public class LuxuryCarFactory implements CarFactory {
   @Override
   public Engine createEngine() {
      return new LuxuryEngine();
   }

   @Override
   public Seat createSeat() {
      return new LuxurySeat();
   }

   @Override
   public Tire createTire() {
      return new LuxuryTire();
   }
}
