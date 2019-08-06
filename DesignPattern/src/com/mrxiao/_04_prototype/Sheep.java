package com.mrxiao._04_prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 原型模式
 *    被克隆的对象要实现两个条件:
 *       1.实现Cloneable接口
 *       2.重写clone()方法
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/23 13:47
 */
public class Sheep implements Cloneable, Serializable {
   private String name;

   private Date birthday;

   public Sheep(String name, Date birthday) {
      this.name = name;
      this.birthday = birthday;
   }

   public String getName() {
      return name;
   }

   /*
   * 实现浅复制
   *     对象的属性不会随着对象的复制而一起复制
   * */
//   @Override
//   public Object clone() throws CloneNotSupportedException {
//      Object obj = super.clone();
//      return obj;
//   }

   /*
   * 实现深复制
   *     对象的属性随着对象的复制一起复制
   * */
   @Override
   public Object clone() throws CloneNotSupportedException {
      Object obj = super.clone();
      Sheep sheep = (Sheep) obj;
      sheep.birthday = (Date) this.birthday.clone();
      return obj;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Date getBirthday() {
      return birthday;
   }

   public void setBirthday(Date birthday) {
      this.birthday = birthday;
   }
}
