package com.mrxiao.cap03;

/*
* 内存分配策略：
*     1.对象优先在新生代Eden区中分配，当Eden区没有足够的空间进行分配时，虚拟机将发起一次Minor GC
*     VM args：-Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
*
*     2.大对象直接进入老年代
*     VM args：-Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
*              -XX:PretenureSizeThreshold=3145728(设置大于3M的对象直接进入老年代)
*
*     3.长期存活的对象将进入老年代
*     VM args: -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
*              -XX:MaxTenuringThreshold=1(设置晋升老年代的阈值)
*
* */
public class MemoryTest {
   private static final int _1MB = 1024 * 1024;

   public static void main(String[] args) {
      testTenuringThreshold();
   }

   private static void testAllocation() {
      byte[] allocation1, allocation2, allocation3, allocation4;
      allocation1 = new byte[2 * _1MB];
      allocation2 = new byte[2 * _1MB];
      allocation3 = new byte[2 * _1MB];
      allocation4 = new byte[4 * _1MB];
   }

   private static void testPretenureSizeThreshold() {
      byte[] allocation = new byte[4 * _1MB];
   }

   private static void testTenuringThreshold() {
      byte[] allocation1 = new byte[_1MB];
      byte[] allocation2 = new byte[_1MB];
      byte[] allocation3 = new byte[4 * _1MB];
      byte[] allocation4 = new byte[4 * _1MB];
      allocation4 = null;
      allocation4 = new byte[4 * _1MB];
   }
}
