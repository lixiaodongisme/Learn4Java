package com.mrxiao._06_proxy.staticproxy;

/**
 * 抽象角色:定义代理类和真实角色的公共对外方法
 *    模拟客户邀请明星表演节目的流程
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/25 16:03
 */
public interface Star {
   // 初步面谈
   void confer();

   // 签合同
   void contract();

   // 订机票
   void bookTicket();

   // 演出
   void sing();

   // 收款
   void collectMoney();
}
