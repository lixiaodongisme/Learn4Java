package com.mrxiao._05_adapter;

/**
 * 适配器类的第二种实现方法
 *    对象适配器
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/25 15:37
 */
public class Adapter2 implements ITarget {
   private Adaptee adaptee;

   public Adapter2(Adaptee adaptee) {
      this.adaptee = adaptee;
   }

   @Override
   public void request() {
      adaptee.request();
   }
}
