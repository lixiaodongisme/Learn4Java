package com.mrxiao._14_mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/31 16:20
 */
public class Manager implements Mediator {
   private Map<String, Department> map = new HashMap<>();

   @Override
   public void register(String departmentName, Department dep) {
      map.put(departmentName, dep);
   }

   @Override
   public void commond(String departmentName) {
      map.get(departmentName).selfAction();
   }
}
