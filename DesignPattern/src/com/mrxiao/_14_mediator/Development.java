package com.mrxiao._14_mediator;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/31 16:11
 */
public class Development implements Department {
   private Mediator mediator;

   public Development(Mediator mediator) {
      this.mediator = mediator;
      mediator.register("development", this);
   }

   @Override
   public void selfAction() {
      System.out.println("研发部专心开发项目!");
   }

   @Override
   public void outAction() {
      System.out.println("研发部缺钱,需要财务部拨款");
      mediator.commond("finacial");
   }
}
