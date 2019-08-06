package com.mrxiao._14_mediator;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/31 16:11
 */
public class Finacial implements Department {
   private Mediator mediator;

   public Finacial(Mediator mediator) {
      this.mediator = mediator;
      mediator.register("finacial", this);
   }

   @Override
   public void selfAction() {
      System.out.println("财务部管理公司的钱!");
   }

   @Override
   public void outAction() {
      System.out.println("财务部需要市场部的数据来分析财务状况");
      mediator.commond("market");
   }
}
