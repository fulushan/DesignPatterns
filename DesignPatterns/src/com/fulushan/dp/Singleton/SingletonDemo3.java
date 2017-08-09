package com.fulushan.dp.Singleton;


/**
 * <双重检查锁实现单例模式>
 * Author fulushan
 * Created  on 17/8/9.
 */
public class SingletonDemo3 {

        private static SingletonDemo3 instance = null;

        private SingletonDemo3() {

        }

        public static SingletonDemo3 getInstance() {
            if (instance == null) {
                SingletonDemo3 sc;
                synchronized (SingletonDemo3.class) {
                    sc = instance;
                    if (sc == null) {
                        synchronized (SingletonDemo3.class) {
                            if(sc == null) {
                                sc = new SingletonDemo3();
                            }
                        }
                        instance = sc;
                    }
                }
            }
            return instance;
        }



}
