package com.mrxiao._13_iterator;

/**
 * 自定义迭代器
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/31 14:50
 */
public interface MyIterator {
   void first();

   void next();

   Object getCurrentObject();

   boolean hasNext();

   boolean isFirst();

   boolean isLast();
}
