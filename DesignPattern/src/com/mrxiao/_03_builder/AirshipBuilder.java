package com.mrxiao._03_builder;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/23 10:47
 */
public interface AirshipBuilder {
   Engine createEngine();

   EscapeTower createEscapeTower();

   OrbitalModule createOrbitalModule();
}
