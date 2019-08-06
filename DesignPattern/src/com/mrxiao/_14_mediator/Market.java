package com.mrxiao._14_mediator;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/31 16:11
 */
public class Market implements Department {
   private Mediator mediator;

   public Market(Mediator mediator) {
      this.mediator = mediator;
      mediator.register("market", this);
   }

   @Override
   public void selfAction() {
      System.out.println("市场部需要跑市场接项目!");
   }

   @Override
   public void outAction() {
      System.out.println("市场部接来的项目需要研发部开发");
      mediator.commond("development");
   }
}
