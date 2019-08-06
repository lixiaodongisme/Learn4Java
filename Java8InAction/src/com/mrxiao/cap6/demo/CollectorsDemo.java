package com.mrxiao.cap6.demo;

import com.mrxiao.cap4.domain.Dish;
import com.mrxiao.cap4.domain.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
   private static List<Dish> menu = Arrays.asList(new Dish("pork", false,
                   800, Type.MEAT), new Dish("beef", false, 700, Type.MEAT), new Dish
                   ("chicken", false, 400, Type.MEAT), new Dish("french fries", true,
                   530, Type.OTHER), new Dish("rice", true, 350, Type.OTHER), new
                   Dish("season fruit", true, 120, Type.OTHER), new Dish("pizza",
                   true, 550, Type.OTHER), new Dish("prawns", false, 300, Type.FISH),
           new Dish("salmon", false, 450, Type.FISH));

   public static void main(String[] args) {
      demo4();
   }

   /*
   * 查找流中的最大值和最小值
   *     找到菜单中卡路里含量最高和最低的菜
   * */
   private static void demo1() {
      Optional<Dish> maxCalories = menu.stream().collect(Collectors.maxBy
              (Comparator.comparingInt(Dish::getCalories)));
      Optional<Dish> minCalories = menu.stream().collect(Collectors.minBy
              (Comparator.comparingInt(Dish::getCalories)));
      System.out.println("maxCalories is " + maxCalories.get() + ", and minCalories is " + minCalories.get());
   }

   /*
   * 求和
   *     求菜单中所有菜的卡路里之和
   * */
   private static void demo2() {
      Integer sum = menu.stream().collect(Collectors.summingInt
              (Dish::getCalories));
      System.out.println(sum);
   }

   /*
   * summarizingInt方法
   * */
   private static void demo3() {
      IntSummaryStatistics res = menu.stream().collect(Collectors
              .summarizingInt(Dish::getCalories));
      System.out.println(res);
   }

   /*
   * 连接字符串
   * */
   private static void demo4() {
      String res = menu.stream().map(Dish::getName).collect(Collectors.joining(", "));
      System.out.println(res);
   }
}
