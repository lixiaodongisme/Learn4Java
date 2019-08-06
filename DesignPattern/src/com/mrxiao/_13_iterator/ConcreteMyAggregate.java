package com.mrxiao._13_iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义聚合类
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/31 14:53
 */
public class ConcreteMyAggregate {
   private List<Object> list = new ArrayList<>();

   public void addObject(Object obj) {
      list.add(obj);
   }

   public void removeObject(Object obj) {
      list.remove(obj);
   }

   public List<Object> getList() {
      return list;
   }

   public void setList(List<Object> list) {
      this.list = list;
   }

   public MyIterator createConcreteIterator() {
      return new ConcreteIterator();
   }

   // 一般使用内部类定义迭代器,因为可以使用外部类的属性
   private class ConcreteIterator implements MyIterator {

      // 定义游标,用于记录遍历时的位置
      private int cursor;

      @Override
      public void first() {
         cursor = 0;
      }

      @Override
      public void next() {
         if (cursor < list.size()) {
            cursor++;
         }
      }

      @Override
      public Object getCurrentObject() {
         return list.get(cursor);
      }

      @Override
      public boolean hasNext() {
         if (cursor < list.size()) {
            return true;
         }
         return false;
      }

      @Override
      public boolean isFirst() {
         return cursor == 0;
      }

      @Override
      public boolean isLast() {
         return cursor == list.size() - 1;
      }
   }
}
