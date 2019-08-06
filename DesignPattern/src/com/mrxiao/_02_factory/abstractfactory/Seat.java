package com.mrxiao._02_factory.abstractfactory;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/22 16:17
 */
public interface Seat {
   void seatHot();
}

class LuxurySeat implements Seat{

   @Override
   public void seatHot() {
      System.out.println("高端座椅有座椅加热");
   }
}

class LowySeat implements Seat{

   @Override
   public void seatHot() {
      System.out.println("低端座椅没有座椅加热");
   }
}
