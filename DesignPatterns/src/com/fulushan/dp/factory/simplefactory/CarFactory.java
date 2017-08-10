package com.fulushan.dp.factory.simplefactory;

/**
 * <汽车工厂>
 * Author fulushan
 * Created on 2017/8/10.
 */
public class CarFactory {


    public static Car createCar(String name){
        switch (name){
            case "比亚迪":
                return new Byd();
            case "奥迪":
                return new Audi();
            default:
                return null;
        }
    }
}
