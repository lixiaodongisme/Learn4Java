package com.mrxiao._05_adapter;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/25 15:30
 */
public class Client {
   public void test(ITarget target) {
      target.request();
   }

   public static void main(String[] args) {
      Client client = new Client();

      // 类适配器
//      ITarget target = new Adapter1();

      // 对象适配器
      Adaptee adaptee = new Adaptee();
      ITarget target = new Adapter2(adaptee);
      client.test(target);
   }
}
