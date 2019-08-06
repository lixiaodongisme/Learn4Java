package com.mrxiao._11_flyweight;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/30 15:45
 */
public class Client {
   public static void main(String[] args) {
      ConcreteFlyweight c1 = FlyweightFactory.getConcreteFlyweight("黑");
      ConcreteFlyweight c2 = FlyweightFactory.getConcreteFlyweight("黑");

      c1.display(new UnsharedConcreteFlyweight(10, 10));
      c1.display(new UnsharedConcreteFlyweight(20, 20));
   }
}
