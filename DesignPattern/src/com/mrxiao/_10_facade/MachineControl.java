package com.mrxiao._10_facade;

/**
 * 外观模式:外部与一个子系统的通信必须通过一个统一的外观对象进行，为子系统中的一组接口提供一个一致的界面
 *    想要让机器运行,只需要打开开关即可
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/29 17:57
 */
public class MachineControl {
   public void open() {
      Gates gates = new Gates();
      Motherboard motherboard = new Motherboard();
      Motor motor = new Motor();
      Machine machine = new Machine();
      gates.openGates();
      motherboard.checkMotherboard();
      motor.checkMotor();
      machine.run();
   }
}
