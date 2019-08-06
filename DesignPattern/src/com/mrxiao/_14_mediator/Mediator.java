package com.mrxiao._14_mediator;

/**
 * 中介对象抽象类
 *    起到了中介作用,协调同事对象之间的联系,避免同事对象之间的联系过于复杂
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/31 16:08
 */
public interface Mediator {
   void register(String departmentName, Department dep);

   void commond(String departmentName);
}
