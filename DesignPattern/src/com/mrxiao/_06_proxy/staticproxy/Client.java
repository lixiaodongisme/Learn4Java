package com.mrxiao._06_proxy.staticproxy;

/**
 * 客户只需要与经济人打交道
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/25 16:27
 */
public class Client {
   public static void main(String[] args) {
      RealStar realStart = new RealStar();
      Star proxyMan = new ProxyMan(realStart);

      proxyMan.confer();
      proxyMan.contract();
      proxyMan.bookTicket();
      proxyMan.sing();
      proxyMan.collectMoney();
   }
}
