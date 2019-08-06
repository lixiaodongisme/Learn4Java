package com.mrxiao._06_proxy.staticproxy;

/**
 * 代理角色:真实角色的代理,通过真实角色的业务逻辑来实现抽象方法,并可以附加自己的操作
 *    统一的流程控制用代理类实现
 * 模拟明星的经纪人
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/25 16:09
 */
public class ProxyMan implements Star {
   private RealStar realStart;

   public ProxyMan(RealStar realStart) {
      this.realStart = realStart;
   }

   @Override
   public void confer() {
      System.out.println("经纪人初步面谈");
   }

   @Override
   public void contract() {
      System.out.println("经纪人签合同");
   }

   @Override
   public void bookTicket() {
      System.out.println("经纪人订演出的机票");
   }

   @Override
   public void sing() {
      realStart.sing();
   }

   @Override
   public void collectMoney() {
      System.out.println("经纪人收款");
   }
}
