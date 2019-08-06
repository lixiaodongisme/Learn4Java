package com.mrxiao._11_flyweight;

/**
 * 抽象享元类:定义公共方法,这些方法可以向外界提供对象的内部状态,设置外部状态
 *    模拟围棋棋子,颜色为内部状态,可以共享,棋子的位置为外部状态
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/30 15:29
 */
public interface Flyweight {
   void getColor();

   void display(UnsharedConcreteFlyweight ucf);
}
