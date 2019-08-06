package com.mrxiao._05_adapter;

/**
 * 适配器类的第一种实现方法
 *    类适配器,也就是通过继承来实现,但是这种方式不够灵活
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/25 15:33
 */
public class Adapter1 extends Adaptee implements ITarget {
   @Override
   public void request() {
      super.request();
   }
}
