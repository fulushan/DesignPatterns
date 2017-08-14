package com.fulushan.dp.prototype;

import java.util.Date;

/**
 * <浅复制>
 * Author fulushan
 * Created  on 17/8/13.
 */
public class Client {


    public static void main(String[] args) throws Exception {
        Date date = new Date(12312321331L);
        Sheep s1 = new Sheep("少利",date);
        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());

        date.setTime(23432432423L);

        System.out.println(s1.getBirthday());

        Sheep s2 = (Sheep) s1.clone();
        s2.setSname("多利");
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());


    }
}
