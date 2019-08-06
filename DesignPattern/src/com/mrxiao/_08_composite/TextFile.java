package com.mrxiao._08_composite;

/**
 * 叶子节点模型
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/29 14:59
 */
public class TextFile implements AbstractFile {
   private String name;

   public TextFile(String name) {
      this.name = name;
   }

   @Override
   public void killVirus() {
      System.out.println("查杀文本文件" + name);
   }
}
