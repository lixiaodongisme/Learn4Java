package com.mrxiao.cap10.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;

public class OptionalDemo {
   public static void main(String[] args) {
//      User user = new User();
//      Optional<String> optName = Optional.of("lili");
//      user.setName(optName);
      String userName = getUserName(null);
      System.out.println(userName);
   }

   private static String getUserName(User u) {
      return Optional.ofNullable(u).flatMap(User::getName).orElse("Unknow");
   }
}

class User {
   Optional<String> name;

   public Optional<String> getName() {
      return name;
   }

   public void setName(Optional<String> name) {
      this.name = name;
   }
}
