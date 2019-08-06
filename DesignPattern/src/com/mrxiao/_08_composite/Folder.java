package com.mrxiao._08_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器模型
 *    模拟一个文件夹下可能会有多个文件
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/29 15:01
 */
public class Folder implements AbstractFile{
   private String name;

   private List<AbstractFile> list = new ArrayList<>();

   public Folder(String name) {
      this.name = name;
   }

   public void add(AbstractFile file) {
      list.add(file);
   }

   public void remove(AbstractFile file) {
      list.remove(file);
   }

   public AbstractFile get(int index) {
      return list.get(index);
   }

   @Override
   public void killVirus() {
      System.out.println("------对文件夹:'" + name + "'进行查杀------");

      for(AbstractFile file : list) {
         file.killVirus();
      }
   }
}
