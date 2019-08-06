package com.mrxiao._10_facade;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/29 17:55
 */
public class Client {
   public static void main(String[] args) {
      // 不使用外观模式时,想要让机器运行,需要依赖于多个对象,违背了迪米特法则
//      Gates gates = new Gates();
//      Motherboard motherboard = new Motherboard();
//      Motor motor = new Motor();
//      Machine machine = new Machine();
//      gates.openGates();
//      motherboard.checkMotherboard();
//      motor.checkMotor();
//      machine.run();

        // 使用外观模式
      MachineControl control = new MachineControl();
      control.open();
   }
}
