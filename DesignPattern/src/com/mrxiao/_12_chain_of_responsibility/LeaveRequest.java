package com.mrxiao._12_chain_of_responsibility;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/30 17:52
 */
public class LeaveRequest {
   private String employeeName;

   private int leaveDays;

   private String reason;

   public LeaveRequest(String employeeName, int leaveDays, String reason) {
      this.employeeName = employeeName;
      this.leaveDays = leaveDays;
      this.reason = reason;
   }

   public String getEmployeeName() {
      return employeeName;
   }

   public void setEmployeeName(String employeeName) {
      this.employeeName = employeeName;
   }

   public int getLeaveDays() {
      return leaveDays;
   }

   public void setLeaveDays(int leaveDays) {
      this.leaveDays = leaveDays;
   }

   public String getReason() {
      return reason;
   }

   public void setReason(String reason) {
      this.reason = reason;
   }
}
