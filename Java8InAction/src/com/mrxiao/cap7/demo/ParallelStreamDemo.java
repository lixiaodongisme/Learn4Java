package com.mrxiao.cap7.demo;

import com.sun.org.apache.regexp.internal.RE;

import java.util.function.BinaryOperator;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ParallelStreamDemo {
   public static void main(String[] args) {
      long begin = System.currentTimeMillis();
      parallelSum(10_000_000);
      long end = System.currentTimeMillis();
      System.out.println(end - begin);
   }

   private static long getSumByFor(int n) {
      long res = 0L;
      for (int i = 0; i <= n; i++) {
         res += i;
      }
      return res;
   }

   /*
   * 需求：输入一个参数n，求前n个数的和
   *     传统思路实现
   * */
   private static long getSum(int n) {
      Long res = Stream.iterate(1L, i -> i + 1).limit(n).reduce(0L, Long::sum);
      return res;
   }

   /*
   * 并行流
   * */
   private static long parallelSum(int n) {
      /*
      * 效率低的原因：1.因为存在装箱和拆箱
      *             2.iterate很难拆分成多个独立的模块
      * */
//      return Stream.iterate(1L, i -> i + 1).limit(n).parallel().reduce
//              (0L, Long::sum);

      return LongStream.rangeClosed(0L, n).parallel().reduce(0L, Long::sum);
   }
}
