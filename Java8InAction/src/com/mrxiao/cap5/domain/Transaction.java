package com.mrxiao.cap5.domain;

public class Transaction {
   private Trader trader;

   private Integer year;

   private Integer value;

   public Transaction(Trader trader, int year, int value) {
      this.trader = trader;
      this.year = year;
      this.value = value;
   }

   public Trader getTrader() {
      return trader;
   }

   public void setTrader(Trader trader) {
      this.trader = trader;
   }

   public Integer getYear() {
      return year;
   }

   public void setYear(Integer year) {
      this.year = year;
   }

   public Integer getValue() {
      return value;
   }

   public void setValue(Integer value) {
      this.value = value;
   }

   @Override
   public String toString() {
      return "Transaction{" + "trader=" + trader + ", year=" + year + ", " +
              "value=" + value + '}';
   }
}
