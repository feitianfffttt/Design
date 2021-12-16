package com.yhl.lib.create.singleton_pattern.singleton1;

/**
 * 飞天 创建
 * on 12/7/2021 11:33 AM
 */
public class Singleton1 {

    private static Singleton1 instance;
    private Singleton1 (){}

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

}
