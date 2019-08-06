package com.mrxiao._02_factory.abstractfactory;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/22 16:21
 */
public interface CarFactory {
   Engine createEngine();
   Seat createSeat();
   Tire createTire();
}
