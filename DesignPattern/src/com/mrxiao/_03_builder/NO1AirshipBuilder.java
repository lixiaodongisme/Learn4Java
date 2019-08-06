package com.mrxiao._03_builder;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/23 10:51
 */
public class NO1AirshipBuilder implements AirshipBuilder {
   @Override
   public Engine createEngine() {
      System.out.println("建造1号发动机");
      return new Engine("1号发动机");
   }

   @Override
   public EscapeTower createEscapeTower() {
      System.out.println("建造1号逃逸塔");
      return new EscapeTower("1号逃逸塔");
   }

   @Override
   public OrbitalModule createOrbitalModule() {
      System.out.println("建造1号轨道舱");
      return new OrbitalModule("1号轨道舱");
   }
}
