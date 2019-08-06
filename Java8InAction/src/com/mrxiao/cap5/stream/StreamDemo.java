package com.mrxiao.cap5.stream;

import com.mrxiao.cap4.domain.Dish;
import com.mrxiao.cap4.domain.Type;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {
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
    * 筛选元素并且去重
    * */
   private static void demo1() {
      Integer[] arr = {1, 1, 2, 3, 2, 4, 1, 5, 4};
      List<Integer> list = Arrays.asList(arr);
      List<Integer> res = list.stream().filter(i -> i % 2 == 0).distinct
              ().collect(Collectors.toList());
      System.out.println(res);
   }

   /*
    * 截断流
    * */
   private static void demo2() {
      Integer[] arr = {1, 2, 3, 4, 5};
      List<Integer> list = Arrays.asList(arr);
      List<Integer> res = list.stream().limit(3).collect(Collectors
              .toList());
      System.out.println(res);
      Set<Integer> set = new HashSet<>();
      set.add(232);
      set.add(223);
      set.add(311);
      set.add(442);
      List<Integer> result = set.stream().limit(3).collect(Collectors.toList
              ());
      System.out.println(result);
   }

   /*
   * 跳过流(结果是与limit互补的)
   * */
   private static void demo3() {
      List<Dish> dishes = menu.stream().filter(dish -> dish.getCalories() >
              500).skip(2).collect(Collectors.toList());
      System.out.println(dishes);
   }

   /*
   * 对流中每一个元素应用函数
   * eg:得到菜单中每道菜名的长度
   * */
   public static void demo4() {
      List<Integer> res = menu.stream().map(Dish::getName).map
              (String::length).collect(Collectors.toList());
      System.out.println(res);
   }
}
