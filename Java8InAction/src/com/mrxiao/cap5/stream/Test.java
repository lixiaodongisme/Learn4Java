package com.mrxiao.cap5.stream;

import com.mrxiao.cap5.domain.Trader;
import com.mrxiao.cap5.domain.Transaction;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* (1) 找出2011年发生的所有交易，并按交易额排序（从低到高）。
(2) 交易员都在哪些不同的城市工作过？
(3) 查找所有来自于剑桥的交易员，并按姓名排序。
(4) 返回所有交易员的姓名字符串，按字母顺序排序。
(5) 有没有交易员是在米兰工作的？
(6) 打印生活在剑桥的交易员的所有交易额。
(7) 所有交易中，最高的交易额是多少？
(8) 找到交易额最小的交易。
* */
public class Test {
   static Trader raoul = new Trader("Raoul", "Cambridge");
   static Trader mario = new Trader("Mario", "Milan");
   static Trader alan = new Trader("Alan", "Cambridge");
   static Trader brian = new Trader("Brian", "Cambridge");

   static List<Transaction> transactions = Arrays.asList(
           new Transaction(brian, 2011, 300),
           new Transaction(raoul, 2012, 1000),
           new Transaction(raoul, 2011, 400),
           new Transaction(mario, 2012, 710),
           new Transaction(mario, 2012, 700),
           new Transaction(alan, 2012, 950));

   static List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);


   public static void main(String[] args) {
      demo4();
   }

   /*
    * 找出2011年发生的所有交易，并按交易额排序（从低到高）。
    * */
   private static void demo1() {
      List<Transaction> res = transactions.stream().filter(transaction -> 
              transaction.getYear() == 2011).sorted((t1, t2) -> t1.getValue()
              .compareTo(t2.getValue())).collect(Collectors.toList());
      System.out.println(res);
   }

   /*
    * 交易员都在哪些不同的城市工作过？
    * */
   private static void demo2() {
      List<String> cities = traders.stream().map(Trader::getCity).distinct()
              .collect(Collectors.toList());
      System.out.println(cities);
   }

   /*
    * 查找所有来自于剑桥的交易员，并按姓名排序。
    * */
   private static void demo3() {
      List<Trader> res = traders.stream().filter(trader -> "Cambridge".equals
              (trader.getCity())).sorted((t1, t2) -> t1.getName().compareTo
              (t2.getName())).collect(Collectors.toList());
      System.out.println(res);
   }

   /*
    * 返回所有交易员的姓名字符串，按字母顺序排序。
    * */
   private static void demo4() {
      String res = traders.stream().map(Trader::getName).distinct().sorted
              ().reduce("", (s1, s2) -> s1 + s2);
      System.out.println(res);
   }

   /*
   * 有没有交易员是在米兰工作的？
   * */
   private static void demo5() {
      boolean flag = traders.stream().anyMatch(trader -> "Milan".equals(trader
              .getCity()));
      System.out.println(flag);
   }

   /*
   * 打印生活在剑桥的交易员的所有交易额。
   * */
   private static void demo6() {
      List<Integer> res = transactions.stream().filter(t -> "Cambridge"
              .equals(t.getTrader().getCity())).map(Transaction::getValue)
              .collect(Collectors.toList());
      System.out.println(res);
   }

   /*
   * 所有交易中，最高的交易额是多少？
   * */
   private static void demo7() {
      Optional<Integer> res = transactions.stream().map
              (Transaction::getValue).reduce(Integer::max);
      System.out.println(res.get());
   }

   /*
   * 找到交易额最小的交易。
   * */
   private static void demo8() {
//      Optional<Transaction> res = transactions.stream().reduce((t1, t2) ->
//              t1.getValue() < t2.getValue() ? t1 : t2);
      Optional<Transaction> res = transactions.stream().min(Comparator
              .comparing(Transaction::getValue));
      System.out.println(res.get());
   }
}
