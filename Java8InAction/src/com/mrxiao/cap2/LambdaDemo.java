package com.mrxiao.cap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/8/7 10:30
 * 需求:通过不同的条件,在仓库中筛选出不同的苹果
 * 通过这个例子,我们来说明为什么需要lambda
 */
public class LambdaDemo {
   public static void main(String[] args) {
      Apple apple1 = new Apple("yellow", 160);
      Apple apple2 = new Apple("green", 140);
      Apple apple3 = new Apple("red", 155);
      List<Apple> inventory = Arrays.asList(apple1, apple2, apple3);

      /*
      * 原始版本
      * 每个方法对应一个筛选条件,缺点是代码重复度高,并且可拓展性差,如果有多个筛选条件,
      * 就要写对应的多个方法,并且只能是单一条件
      * */
      List<Apple> redApples = filterRedApple(inventory, "red");
      List<Apple> weightApples = filterWeightApple(inventory, 150);

      /*
      * 改进版本1
      * 把所有的属性结合起来,通过一个filter方法来对苹果进行过滤.这个版本的问题是,如果属性有很多,
      * 例如还有产地,形状,品种....那么此时filter方法写起来就会特别复杂,并且可读性非常差.
      * */
      List<Apple> apples = filterApple(inventory, "red", 150, true);

      /*
      * 改进版本2
      * 可以创建不同的ApplePredicate对象,并将它们传递给filterApples方法.
      * 如果让你找出所有重量超过150克的红苹果,只需要创建一个类来实现ApplePredicate就行了.
      * 代码现在足够灵活,可以应对任何涉及苹果属性的需求
      * */
      List<Apple> redApples2 = filterApple2(inventory, new ApplePredicate() {
         @Override
         public boolean test(Apple apple) {
            return "red".equals(apple.getColor());
         }
      });
      List<Apple> weigthApple2 = filterApple2(inventory, new ApplePredicate() {
         @Override
         public boolean test(Apple apple) {
            return apple.getWeight() > 150;
         }
      });

      /*
      * 改进版本-->Lambda表达式
      * 使用lambda表达式改写后,可以看到代码简洁了非常多!
      * */
      List<Apple> apples1 = filterApple2(inventory,
              apple -> "red".equals(apple.getColor()));
      List<Apple> apples2 = filterApple2(inventory,
              apple -> apple.getWeight() > 150);

      /*
      * 最终版本
      * 目前filterApple这个方法还只适用于苹果类,我们可以通过更加抽象的Predicate接口和filter()方法,
      * 来把filter这个方法用到任意类型上.
      * */
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
      List<Integer> res = filter(numbers, number -> number % 2 == 0);
      System.out.println(res);

   }

   private static List<Apple> filterRedApple(List<Apple> inventory, String color) {
      List<Apple> result = new ArrayList<>();
      for(Apple apple : inventory) {
         if(color.equals(apple.getColor())) {
            result.add(apple);
         }
      }

      return result;
   }

   private static List<Apple> filterWeightApple(List<Apple> inventory, int weight) {
      List<Apple> result = new ArrayList<>();
      for(Apple apple : inventory) {
         if(apple.getWeight() > weight) {
            result.add(apple);
         }
      }

      return result;
   }

   private static List<Apple> filterApple(List<Apple> inventory, String color
           , int weight, boolean flag) {
      List<Apple> result = new ArrayList<>();
      for(Apple apple : inventory) {
         if(flag && color.equals(apple.getColor()) || !flag && apple.getWeight() > weight) {
            result.add(apple);
         }
      }

      return result;
   }

   private static List<Apple> filterApple2(List<Apple> inventory, ApplePredicate predicate) {
      List<Apple> result = new ArrayList<>();
      for(Apple apple : inventory) {
         if(predicate.test(apple)) {
            result.add(apple);
         }
      }

      return result;
   }

   private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
      List<T> result = new ArrayList<>();
      for(T t : list) {
         if(predicate.test(t)) {
            result.add(t);
         }
      }

      return result;
   }

}

interface ApplePredicate {
   boolean test(Apple apple);
}

interface Predicate<T> {
   boolean test(T t);
}

class Apple {
   private String color;

   private int weight;

   public Apple(String color, int weight) {
      this.color = color;
      this.weight = weight;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public int getWeight() {
      return weight;
   }

   public void setWeight(int weight) {
      this.weight = weight;
   }

   @Override
   public String toString() {
      return "Apple{" + "color='" + color + '\'' + ", weight=" + weight + '}';
   }
}
