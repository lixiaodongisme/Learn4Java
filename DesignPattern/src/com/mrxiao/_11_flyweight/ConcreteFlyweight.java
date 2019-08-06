package com.mrxiao._11_flyweight;

/**
 * 具体享元类:为内部状态提供成员变量进行存储
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/30 15:33
 */
public class ConcreteFlyweight implements Flyweight{
   private String color;

   public ConcreteFlyweight(String color) {
      this.color = color;
   }

   @Override
   public void getColor() {
      System.out.println("这是一个" + color + "棋子");
   }

   @Override
   public void display(UnsharedConcreteFlyweight ucf) {
      System.out.println(color + "棋,落在" + ucf.getX() + "," + ucf.getY());
   }
}
