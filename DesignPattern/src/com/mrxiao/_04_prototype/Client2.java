package com.mrxiao._04_prototype;

import java.io.*;
import java.util.Date;

/**
 * 使用序列化和反序列化来实现深复制
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/23 15:40
 */
public class Client2 {
   public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
      Date date = new Date(1212121212);
      Sheep s1 = new Sheep("喜羊羊", date);

      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      ObjectOutputStream oos = new ObjectOutputStream(bos);
      oos.writeObject(s1);
      byte[] bytes = bos.toByteArray();

      ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
      ObjectInputStream ois = new ObjectInputStream(bis);
      Sheep s2 = (Sheep) ois.readObject();

      System.out.println("修改前的时间:" + date);
      date.setTime(111122222);
      System.out.println("修改后的时间:" + date);

      System.out.println(s1);
      System.out.println(s1.getName());
      System.out.println(s1.getBirthday());

      System.out.println(s2);
      System.out.println(s2.getName());
      System.out.println(s2.getBirthday());
   }
}
