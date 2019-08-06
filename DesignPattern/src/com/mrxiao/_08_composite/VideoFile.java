package com.mrxiao._08_composite;

/**
 * 叶子节点模型
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/29 14:58
 */
public class VideoFile implements AbstractFile {
   private String name;

   public VideoFile(String name) {
      this.name = name;
   }

   @Override
   public void killVirus() {
      System.out.println("查杀视频文件" + name);
   }
}
