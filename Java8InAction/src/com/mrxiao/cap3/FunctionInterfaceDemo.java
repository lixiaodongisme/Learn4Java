package com.mrxiao.cap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/8/7 14:07
 * Java8常用的函数式接口
 */
public class FunctionInterfaceDemo {
   public static void main(String[] args) {
      List<String> listOfStrings = Arrays.asList("hello", "", "world");

      /*
      * Predicate
      * 函数描述符:T->boolean
      * 筛选出非空字符串
      * */
      Predicate<String> notEmptyStringPredicate = s -> !s.isEmpty();
      List<String> res = filter(listOfStrings, notEmptyStringPredicate);
      System.out.println(res);

      /*
      * Consumer
      * 函数描述符:T->void
      * 遍历集合并打印集合中的每个元素
      * */
      FunctionInterfaceDemo.forEach(listOfStrings, i -> System.out.println(i));

      /*
      * Function
      * 函数描述符:T->R
      * 将一个String集合映射到包含每个String长度的Integer集合
      * */
      List<Integer> lengthOfString = map(listOfStrings, s -> s.length());
      System.out.println(lengthOfString);

      /*
      * Supplier
      * 函数描述符:void->T
      * */
      Supplier<String> s = () -> "hello";
      System.out.println(s.get());
   }

   private static <T, R> List<R> map(List<T> list, Function<T, R> f) {
      List<R> result = new ArrayList<>();
      for(T t : list) {
         R r = f.apply(t);
         result.add(r);
      }
      return result;
   }

   private static <T> void forEach(List<T> list, Consumer<T> c) {
      for(T t : list) {
         c.accept(t);
      }
   }

   private static <T> List<T> filter(List<T> list, Predicate<T> p) {
      List<T> result = new ArrayList<>();
      for(T t : list) {
         if(p.test(t)) {
            result.add(t);
         }
      }
      return result;
   }
}
