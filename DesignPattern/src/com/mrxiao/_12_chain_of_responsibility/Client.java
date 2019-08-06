package com.mrxiao._12_chain_of_responsibility;

/**
 * 责任链模式
 *    模拟提交请假流程
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/30 18:04
 */
public class Client {
   public static void main(String[] args) {
      Leader l1 = new Director("张三");
      Leader l2 = new Manager("李四");
      Leader l3 = new GeneralManager("王五");

//      l1.setNextLeader(l2);
//      l2.setNextLeader(l3);
//
//      LeaveRequest request = new LeaveRequest("小李", 2, "家中有事");
//      l1.handleRequest(request);

      /*
      * 使用责任链模式的好处
      *     如果要增加新的处理流程,可以在不修改原有代码而直接增加
      *     新增条件:请假天数大于10天,小于20天,由副总审批
      * */
      ViceGeneralManager l4 = new ViceGeneralManager("张麻子");
      l1.setNextLeader(l2);
      l2.setNextLeader(l4);
      l4.setNextLeader(l3);

      LeaveRequest request = new LeaveRequest("小李", 31, "家中有事");
      l1.handleRequest(request);

   }
}
