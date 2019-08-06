package com.mrxiao._02_factory.abstractfactory;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/22 16:23
 */
public class LowCarFactory implements CarFactory {
   @Override
   public Engine createEngine() {
      return new LowEngine();
   }

   @Override
   public Seat createSeat() {
      return new LowySeat();
   }

   @Override
   public Tire createTire() {
      return new LowTire();
   }
}
