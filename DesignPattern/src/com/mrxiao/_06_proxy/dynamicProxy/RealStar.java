package com.mrxiao._06_proxy.dynamicProxy;

/**
 * 真实角色:实现抽象角色,定义真实角色所要实现的业务逻辑,供代理角色调用
 *    关注真正的业务逻辑
 *    模拟真实的明星
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/25 16:12
 */
public class RealStar implements Star{
   @Override
   public void confer() {
      System.out.println("真实明星初步面谈");
   }

   @Override
   public void contract() {
      System.out.println("真实明星签合同");
   }

   @Override
   public void bookTicket() {
      System.out.println("真实明星订演出的机票");
   }

   @Override
   public void sing() {
      System.out.println("真实明星演出");
   }

   @Override
   public void collectMoney() {
      System.out.println("真实明星收款");
   }
}
