package com.mrxiao._12_chain_of_responsibility;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/30 17:54
 */
public abstract class Leader {
   protected String name;

   protected Leader nextLeader;

   public Leader(String name) {
      this.name = name;
   }

   public void setNextLeader(Leader nextLeader) {
      this.nextLeader = nextLeader;
   }

   abstract void handleRequest(LeaveRequest request);
}
