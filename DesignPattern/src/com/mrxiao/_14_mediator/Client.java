package com.mrxiao._14_mediator;

/**
 * 中介者模式
 *    如果一个系统中对象之间的联系呈网状结构,对象之间存在大量多对多联系,将导致关系极其复杂,
 *    这些对象称之为同事对象
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/31 16:20
 */
public class Client {
   public static void main(String[] args) {
      Mediator mediator = new Manager();

      Development development = new Development(mediator);
      Finacial finacial = new Finacial(mediator);
      Market market = new Market(mediator);

      development.selfAction();
      development.outAction();
   }
}
