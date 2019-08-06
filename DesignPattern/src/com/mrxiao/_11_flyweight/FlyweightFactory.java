package com.mrxiao._11_flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类,用来获取享元对象
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/30 15:41
 */
public class FlyweightFactory {
   private static Map<String, ConcreteFlyweight> map = new HashMap<>();

   public static ConcreteFlyweight getConcreteFlyweight(String color) {
      if(map.get(color) != null) {
         return map.get(color);
      } else {
         ConcreteFlyweight c = new ConcreteFlyweight(color);
         map.put(color, c);
         return c;
      }
   }
}
