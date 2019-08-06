package com.mrxiao.cap07._02_clinit;

public class DeadLoopTest {
   static class DeadLoopClass {
      static {
         if (true) {
            System.out.println(Thread.currentThread() + "init DeadLoopClass");
            while(true) {

            }
         }
      }
   }

   public static void main(String[] args) {
      Runnable run = new Runnable() {
         @Override
         public void run() {
            System.out.println(Thread.currentThread() + "start");
            DeadLoopClass deadLoopClass = new DeadLoopClass();
            System.out.println(Thread.currentThread() + "run over");
         }
      };

      Thread t1 = new Thread(run);
      Thread t2 = new Thread(run);
      t1.start();
      t2.start();
   }
}
