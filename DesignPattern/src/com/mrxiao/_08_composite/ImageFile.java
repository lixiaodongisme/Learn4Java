package com.mrxiao._08_composite;

/**
 * 叶子节点模型
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/29 14:56
 */
public class ImageFile implements AbstractFile{
   private String name;

   public ImageFile(String name) {
      this.name = name;
   }

   @Override
   public void killVirus() {
      System.out.println("查杀图片文件" + name);
   }
}
