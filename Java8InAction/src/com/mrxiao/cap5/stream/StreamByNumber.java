package com.mrxiao.cap5.stream;

import com.mrxiao.cap4.domain.Dish;
import com.mrxiao.cap4.domain.Type;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamByNumber {
   private static List<Dish> menu = Arrays.asList(new Dish("pork", false,
                   800, Type.MEAT), new Dish("beef", false, 700, Type.MEAT), new Dish
                   ("chicken", false, 400, Type.MEAT), new Dish("french fries", true,
                   530, Type.OTHER), new Dish("rice", true, 350, Type.OTHER), new
                   Dish("season fruit", true, 120, Type.OTHER), new Dish("pizza",
                   true, 550, Type.OTHER), new Dish("prawns", false, 300, Type.FISH),
           new Dish("salmon", false, 450, Type.FISH));

   public static void main(String[] args) {
      demo2();
   }

   /*
   * 对所有菜的卡路里求和(可以避免装箱拆箱所带来的效率问题)
   * */
   private static void demo1() {
      int sum = menu.stream().mapToInt(Dish::getCalories).sum();
      System.out.println(sum);
   }

   private static void demo2() {
      long sum = IntStream.range(1, 100).filter(i -> i % 2 == 0)
              .count();
      System.out.println(sum);
   }
}
