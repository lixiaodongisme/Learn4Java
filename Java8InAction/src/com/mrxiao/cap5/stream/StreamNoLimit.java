package com.mrxiao.cap5.stream;

import java.util.stream.Stream;

/*
* 无限流
* */
public class StreamNoLimit {
   public static void main(String[] args) {
      demo2();
   }

   // 使用iterate()生成无限流
   private static void demo1() {
      Stream.iterate(0, n -> n + 2).limit(10).forEach(System.out :: println);
   }

   // 使用generate()生成无限流
   private static void demo2() {
      Stream.generate(Math :: random).limit(5).forEach(System.out :: println);
   }
}
