package com.mrxiao._04_prototype;

import java.util.Date;

/**
 * 测试原型模式
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/23 13:50
 */
public class Client1 {
   public static void main(String[] args) throws CloneNotSupportedException {
      Date date = new Date(1212121212);
      Sheep s1 = new Sheep("喜羊羊", date);
      Sheep s2 = (Sheep)s1.clone();

      date.setTime(111122222);

      System.out.println(s1);
      System.out.println(s1.getName());
      System.out.println(s1.getBirthday());

      System.out.println(s2);
      System.out.println(s2.getName());
      System.out.println(s2.getBirthday());
   }
}
