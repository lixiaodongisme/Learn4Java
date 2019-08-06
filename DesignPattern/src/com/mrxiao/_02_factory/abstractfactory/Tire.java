package com.mrxiao._02_factory.abstractfactory;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/22 16:19
 */
public interface Tire {
   void tireVoice();
}

class LuxuryTire implements Tire {

   @Override
   public void tireVoice() {
      System.out.println("高端轮胎胎噪小");
   }
}

class LowTire implements Tire {

   @Override
   public void tireVoice() {
      System.out.println("低端轮胎胎噪大");
   }
}