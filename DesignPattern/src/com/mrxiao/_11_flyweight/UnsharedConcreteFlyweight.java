package com.mrxiao._11_flyweight;

/**
 * 外部状态类
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/30 15:36
 */
public class UnsharedConcreteFlyweight {
   private int x;

   private int y;

   public UnsharedConcreteFlyweight(int x, int y) {
      this.x = x;
      this.y = y;
   }

   public int getX() {
      return x;
   }

   public void setX(int x) {
      this.x = x;
   }

   public int getY() {
      return y;
   }

   public void setY(int y) {
      this.y = y;
   }
}
