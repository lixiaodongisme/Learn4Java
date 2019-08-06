package com.mrxiao._02_factory.abstractfactory;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/22 16:25
 */
public class Client {
   public static void main(String[] args) {
      Engine lowEngine = new LowCarFactory().createEngine();
      lowEngine.run();
      lowEngine.start();
   }
}
