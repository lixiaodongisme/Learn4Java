package com.mrxiao._12_chain_of_responsibility;

/**
 * 主任
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/30 17:57
 */
public class Manager extends Leader{

   public Manager(String name) {
      super(name);
   }

   @Override
   void handleRequest(LeaveRequest request) {
      if (request.getLeaveDays() < 10) {
         System.out.println(request.getEmployeeName() + "请假" + request
                 .getLeaveDays() + "天, 原因:" + request.getReason());
         System.out.println("经理" + name + "审批通过");
      } else {
         if(nextLeader != null) {
            nextLeader.handleRequest(request);
         }
      }
   }
}
