package com.mrxiao._01_singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 通过反射与反序列化来破解单例
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/22 13:56
 */
public class Client2 {
   public static void main(String[] args) throws Exception {
      SingletonDemo6 s1 = SingletonDemo6.getInstance();
      SingletonDemo6 s2 = SingletonDemo6.getInstance();

      System.out.println(s1);
      System.out.println(s2);

      /*
      * 反射漏洞
      * */
//      Class<SingletonDemo6> clazz = (Class<SingletonDemo6>) Class.forName
//              ("com.mrxiao._01_singleton" + ".SingletonDemo6");
//
//      Constructor<SingletonDemo6> c = clazz
//              .getDeclaredConstructor(null);
//      c.setAccessible(true);
//      SingletonDemo6 s3 = c.newInstance(null);
//      System.out.println(s3);

      /*
      * 反序列化漏洞
      * */
      FileOutputStream fos = new FileOutputStream("d:/a.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(s1);
      fos.close();
      oos.close();

      FileInputStream fis = new FileInputStream("d:/a.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);
      SingletonDemo6 s3 = (SingletonDemo6)ois.readObject();
      fis.close();
      ois.close();

      System.out.println(s3);
   }
}
