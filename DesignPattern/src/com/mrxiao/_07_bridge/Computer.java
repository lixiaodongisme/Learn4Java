package com.mrxiao._07_bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * 电脑,桥接了品牌类,实现了灵活扩展
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/28 15:13
 */
public abstract class Computer {
   protected Brand brand;

   public Computer(Brand brand) {
      this.brand = brand;
   }

   abstract void sell();
}

class Destop extends Computer{

   public Destop(Brand brand) {
      super(brand);
   }

   @Override
   void sell() {
      brand.sell();
      System.out.println("出售台式机");
   }
}

class Laptop extends Computer{

   public Laptop(Brand brand) {
      super(brand);
   }

   @Override
   void sell() {
      brand.sell();
      System.out.println("出售笔记本机");
   }
}

class Pad extends Computer{

   public Pad(Brand brand) {
      super(brand);
   }

   @Override
   void sell() {
      brand.sell();
      System.out.println("出售平板");
   }
}
