package com.mrxiao._13_iterator;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/31 15:02
 */
public class Client {
   public static void main(String[] args) {
      ConcreteMyAggregate cma = new ConcreteMyAggregate();
      cma.addObject("aa");
      cma.addObject("bb");
      cma.addObject("cc");

      MyIterator iterator = cma.createConcreteIterator();

      while(iterator.hasNext()) {
         System.out.println(iterator.getCurrentObject());
         iterator.next();
      }
   }
}
