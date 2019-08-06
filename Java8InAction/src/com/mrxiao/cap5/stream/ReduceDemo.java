package com.mrxiao.cap5.stream;

import com.mrxiao.cap4.domain.Dish;
import com.mrxiao.cap4.domain.Type;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {
   private static List<Dish> menu = Arrays.asList(new Dish("pork", false,
                   800, Type.MEAT), new Dish("beef", false, 700, Type.MEAT), new Dish
                   ("chicken", false, 400, Type.MEAT), new Dish("french fries", true,
                   530, Type.OTHER), new Dish("rice", true, 350, Type.OTHER), new
                   Dish("season fruit", true, 120, Type.OTHER), new Dish("pizza",
                   true, 550, Type.OTHER), new Dish("prawns", false, 300, Type.FISH),
           new Dish("salmon", false, 450, Type.FISH));

   public static void main(String[] args) {
      demo3();
   }

   private static void demo1() {
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//      Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
      Integer sum = numbers.stream().reduce(0, Integer::sum);
      System.out.println(sum);
   }

   /*
   * 求流中的最大值和最小值
   * */
   private static void demo2() {
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//      Optional<Integer> max = numbers.stream().reduce(Integer::max);
      Optional<Integer> max = numbers.stream().reduce((x, y) -> x > y ? x
              : y);
      System.out.println(max.get());

//      Optional<Integer> min = numbers.stream().reduce(Integer::min);
      Optional<Integer> min = numbers.stream().reduce((x, y) -> x > y ? y
              : x);
      System.out.println(min.get());
   }

   /*
   * 使用reduce和map数一数菜单中总共有多少道菜（将菜单中的菜全部映射为1，然后求和）
   * */
   private static void demo3() {
      Integer sum = menu.stream().map(dish -> 1).reduce(0, Integer::sum);
      long count = menu.stream().count();
      System.out.println(sum == menu.size());
      System.out.println(count);
   }
}
