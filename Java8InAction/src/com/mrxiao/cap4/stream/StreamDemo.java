package com.mrxiao.cap4.stream;

import com.mrxiao.cap4.domain.Dish;
import com.mrxiao.cap4.domain.Type;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
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
      demo2();
   }

   /*
    * 使用原始的匿名内部类方式来写
    * */
   private static void demo1() {
      List<String> dishes = menu.stream().filter(new Predicate<Dish>() {
         @Override
         public boolean test(Dish dish) {
            return dish.getCalories() > 500;
         }
      }).map(new Function<Dish, String>() {
         @Override
         public String apply(Dish dish) {
            return dish.getName();
         }
      }).limit(3).collect(Collectors.toList());

      System.out.println(dishes);
   }

   /*
    * 使用lambda表达式来实现
    * */
   private static void demo2() {
      List<String> dishes = menu.stream().filter(dish -> {
         System.out.println("filter:" + dish.getName());
         return dish.getCalories() > 500;
      }).map(dish -> {
         System.out.println("mapping:" + dish.getName());
         return dish.getName();
      }).limit(3).collect(Collectors.toList());
      System.out.println(dishes);
   }

   /*
    * 使用方法引用来写
    * */
   private static void demo3() {
      List<String> dishes = menu.stream().filter(dish -> dish.getCalories() >
              500).map(Dish::getName).limit(3).collect(Collectors.toList());
      System.out.println(dishes);
   }
}
