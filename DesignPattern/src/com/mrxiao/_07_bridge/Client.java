package com.mrxiao._07_bridge;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/28 15:24
 */
public class Client {
   public static void main(String[] args) {
      // 销售联想台式机
      Destop destop = new Destop(new Lenovo());
      destop.sell();

      // 销售戴尔笔记本
      Laptop laptop = new Laptop(new Dell());
      laptop.sell();

      // 销售联想平板
      Pad pad = new Pad(new Lenovo());
      pad.sell();
   }
}
