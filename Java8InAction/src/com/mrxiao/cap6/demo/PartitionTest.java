package com.mrxiao.cap6.demo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
* 需求：接受一个参数n，将前n个数分为质数和非质数
* */
public class PartitionTest {
   public static void main(String[] args) {
      boolean res = isPrime(4);
      System.out.println(res);
   }

   public static boolean isPrime(int number) {
      return IntStream.range(2, number).noneMatch(i -> number % i == 0);
   }

   public static Map<Boolean, List<Integer>> partitionByIsPrime(int number) {
      Map<Boolean, List<Integer>> res = IntStream.range(2, number).boxed
              ().collect(Collectors.partitioningBy((i) -> isPrime(i)));
      return res;
   }
}
