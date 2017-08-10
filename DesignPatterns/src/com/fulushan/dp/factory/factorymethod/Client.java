package com.fulushan.dp.factory.factorymethod;
/**
 * <工厂方法客户端>
 * Author fulushan
 * Created on 2017/8/10.
 */
public class Client {
    //工厂方法模式： 新增产品 只需要新增工厂类
    public static void main(String[] args) {
      Car c1 = new BydFactory().createCar();
      Car c2 = new AudiFactory().createCar();

        c1.run();
        c2.run();
    }
}
