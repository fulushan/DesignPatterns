package com.fulushan.dp.Singleton;

/**
 * <恶汉模式>
 * Author fulushan
 * Created  on 17/8/9.
 */
public class SingletonDemo1 {

   //类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的是线程安全的！

    private static SingletonDemo1 instance = new SingletonDemo1();

    private SingletonDemo1(){

    }

    public SingletonDemo1 getInstance(){
        return instance;
    }

}
