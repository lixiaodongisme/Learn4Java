package com.mrxiao._03_builder;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/23 10:36
 */
public class AirShip {
   private Engine engine; // 发动机

   private EscapeTower escapeTower; // 逃逸塔

   private OrbitalModule orbitalModule; // 轨道舱

   // 发射
   public void run() {
      System.out.println(engine.getName() + "正常");
      System.out.println(escapeTower.getName() + "正常");
      System.out.println(orbitalModule.getName() + "正常");
      System.out.println("飞船发射!");
   }

   public Engine getEngine() {
      return engine;
   }

   public void setEngine(Engine engine) {
      this.engine = engine;
   }

   public EscapeTower getEscapeTower() {
      return escapeTower;
   }

   public void setEscapeTower(EscapeTower escapeTower) {
      this.escapeTower = escapeTower;
   }

   public OrbitalModule getOrbitalModule() {
      return orbitalModule;
   }

   public void setOrbitalModule(OrbitalModule orbitalModule) {
      this.orbitalModule = orbitalModule;
   }
}

class Engine {
   private String name;

   public Engine(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}

class EscapeTower {
   private String name;

   public EscapeTower(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}

class OrbitalModule {
   private String name;

   public OrbitalModule(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
