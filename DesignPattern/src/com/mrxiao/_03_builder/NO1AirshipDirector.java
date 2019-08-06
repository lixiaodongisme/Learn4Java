package com.mrxiao._03_builder;

/**
 * @author ：lixiaodongisme@163.com
 * @date ：Created in 2019/1/23 10:54
 */
public class NO1AirshipDirector implements AirshipDirector {
   private AirshipBuilder airshipBuilder;

   public NO1AirshipDirector(AirshipBuilder no1AirshipBuilder) {
      this.airshipBuilder = no1AirshipBuilder;
   }

   @Override
   public AirShip createNo1AirShip() {
      Engine engine = airshipBuilder.createEngine();
      EscapeTower escapeTower = airshipBuilder.createEscapeTower();
      OrbitalModule orbitalModule = airshipBuilder.createOrbitalModule();

      // 组装飞船对象
      AirShip airShip = new AirShip();
      airShip.setEngine(engine);
      airShip.setEscapeTower(escapeTower);
      airShip.setOrbitalModule(orbitalModule);

      return airShip;
   }

   /*
   * 下面可以按照需求来进行扩展,根据构建器来组装不同的产品...
   * */
   public AirShip createNo2AirShip() {
      // TODO
      return null;
   }
}
