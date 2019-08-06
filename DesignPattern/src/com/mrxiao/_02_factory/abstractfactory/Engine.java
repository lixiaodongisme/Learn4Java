package com.mrxiao._02_factory.abstractfactory;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/22 16:14
 */
public interface Engine {
   void run();
   void start();
}

class LuxuryEngine implements Engine {

   @Override
   public void run() {
      System.out.println("高端发动机运行");
   }

   @Override
   public void start() {
      System.out.println("高端发动机启动");
   }
}

class LowEngine implements Engine {

   @Override
   public void run() {
      System.out.println("低端发动机运行");
   }

   @Override
   public void start() {
      System.out.println("低端发动机启动");
   }
}
