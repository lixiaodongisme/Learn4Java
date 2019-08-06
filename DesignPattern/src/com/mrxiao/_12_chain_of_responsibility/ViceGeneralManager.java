package com.mrxiao._12_chain_of_responsibility;

/**
 * 主任
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/30 17:57
 */
public class ViceGeneralManager extends Leader{

   public ViceGeneralManager(String name) {
      super(name);
   }

   @Override
   void handleRequest(LeaveRequest request) {
      if (request.getLeaveDays() < 20) {
         System.out.println(request.getEmployeeName() + "请假" + request
                 .getLeaveDays() + "天, 原因:" + request.getReason());
         System.out.println("副总经理" + name + "审批通过");
      } else {
         nextLeader.handleRequest(request);
      }
   }
}
