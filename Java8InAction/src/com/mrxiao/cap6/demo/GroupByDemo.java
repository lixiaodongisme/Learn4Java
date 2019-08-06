package com.mrxiao.cap6.demo;

import com.mrxiao.cap4.domain.Dish;
import com.mrxiao.cap4.domain.Type;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GroupByDemo {
   public enum CaloricLevel {DIET, NORMAL, FAT}

   private static List<Dish> menu = Arrays.asList(new Dish("pork", false,
           800, Type.MEAT), new Dish("beef", false, 700, Type.MEAT), new Dish
           ("chicken", false, 400, Type.MEAT), new Dish("french fries", true,
           530, Type.OTHER), new Dish("rice", true, 350, Type.OTHER), new
           Dish("season fruit", true, 120, Type.OTHER), new Dish("pizza",
           true, 550, Type.OTHER), new Dish("prawns", false, 300, Type.FISH),
           new Dish("salmon", false, 450, Type.FISH));

   public static void main(String[] args) {
      demo6();
   }

   /*
    * 根据食物的类型对食物分组
    * */
   private static void demo1() {
      Map<Type, List<Dish>> dishesByType = menu.stream().collect(Collectors
              .groupingBy(Dish::getType));
      System.out.println(dishesByType);
   }

   /*
    * 按食物的热量分成低热量、高热量、普通。三组
    * */
   private static void demo2() {
      Map<CaloricLevel, List<Dish>> dishesByCaloric = menu.stream().collect
              (Collectors.groupingBy(dish -> {
         return getCaloricLevel(dish);
      }));
      System.out.println(dishesByCaloric);
   }

   /*
    * 多级分组
    * */
   private static void demo3() {
      Map<Type, Map<CaloricLevel, List<Dish>>> res = menu.stream().collect
              (Collectors.groupingBy(Dish::getType, Collectors.groupingBy
                      (dish -> {
         return getCaloricLevel(dish);
      })));
      System.out.println(res);
   }

   private static CaloricLevel getCaloricLevel(Dish dish) {
      if(dish.getCalories() <= 400) {
         return CaloricLevel.DIET;
      }
      else if(dish.getCalories() <= 700) {
         return CaloricLevel.NORMAL;
      }
      else {
         return CaloricLevel.FAT;
      }
   }

   /*
    * 查找每个类型的食物中热量最高的dish
    * */
   private static void demo4() {
      Map<Type, Dish> res = menu.stream().collect(Collectors.groupingBy
              (Dish::getType, Collectors.collectingAndThen(Collectors.maxBy
                      (Comparator.comparingInt(Dish::getCalories)),
                      Optional::get)));
      System.out.println(res);
   }

   /*
   * groupingBy结合mapping收集器：
   *     对于每种类型的Dish，菜单中都有哪些CaloricLevel？
   * */
   private static void demo5() {
      Map<Type, HashSet<CaloricLevel>> res = menu.stream().collect
              (Collectors.groupingBy(Dish::getType, Collectors.mapping(dish
                      -> getCaloricLevel(dish), Collectors.toCollection
                      (HashSet::new))));
      System.out.println(res);
   }

   /*
   * partitioningBy：分区是分组的特殊情况，只能分为两组，true一组，false一组
   *     得到菜单中的所有素食
   * */
   private static void demo6() {
      Map<Boolean, List<Dish>> res = menu.stream().collect(Collectors
              .partitioningBy(Dish::isVegetarian));
      System.out.println(res.get(true));
   }
}
