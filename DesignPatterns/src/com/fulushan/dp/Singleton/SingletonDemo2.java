package com.fulushan.dp.Singleton;


/**
 * <懒汉模式>
 * Author fulushan
 * Created  on 17/8/9.
 */
public class SingletonDemo2 {

    //类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。

    private static SingletonDemo2 instance ;

    private SingletonDemo2(){ //私有化构造器

    }
    //方法同步，调用效率低！
    public static synchronized SingletonDemo2 getInstance(){
         if(null == instance){
             instance  = new SingletonDemo2();
         }
        return instance;
    }

}
