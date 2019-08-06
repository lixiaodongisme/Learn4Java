package com.mrxiao._07_bridge;

/**
 * 品牌
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/28 15:14
 */
public interface Brand {
   void sell();
}

class Lenovo implements Brand {

   @Override
   public void sell() {
      System.out.println("销售联想电脑");
   }
}

class Dell implements Brand {

   @Override
   public void sell() {
      System.out.println("销售戴尔电脑");
   }
}
