package com.mrxiao._14_mediator;

/**
 * 同事对象抽象接口
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/31 16:09
 */
public interface Department {
   // 自身的职责
   void selfAction();

   // 需要其他对象协助的工作
   void outAction();
}
