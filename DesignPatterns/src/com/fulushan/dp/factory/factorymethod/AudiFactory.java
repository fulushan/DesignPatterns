package com.fulushan.dp.factory.factorymethod;


/**
 * < >
 * Author fulushan
 * Created on 2017/8/10.
 */
public class AudiFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Audi();
    }
}
