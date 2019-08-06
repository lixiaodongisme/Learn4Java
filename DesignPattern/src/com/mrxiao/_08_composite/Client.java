package com.mrxiao._08_composite;

/**
 * 组合模式:常用于处理一些具有树形结构的数据,使用组合模式可以使得用户对单个对象和组合对象的使用具有一致性
 *    模拟杀毒软件查杀文件夹和文件夹中的文件
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/29 15:06
 */
public class Client {
   public static void main(String[] args) {
      AbstractFile file1, file2, file3, file4;
      file1 = new ImageFile("我的头像.jpg");
      file2 = new TextFile("鬼吹灯.txt");
      file3 = new VideoFile("阿甘正传.mp4");
      file4 = new VideoFile("肖申克的救赎.avi");

//      file1.killVirus();

      Folder folder1 = new Folder("我的下载");
      Folder folder2 = new Folder("我的电影");

      folder1.add(file1);
      folder1.add(file2);

      folder2.add(file3);
      folder2.add(file4);
      folder1.add(folder2);

      folder1.killVirus();
   }
}
